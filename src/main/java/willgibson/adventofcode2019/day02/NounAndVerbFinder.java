package willgibson.adventofcode2019.day02;

public class NounAndVerbFinder {

    private final IntCodeComputerPart2 intCodeComputer;

    private final static int searchLimit = 100;

    public NounAndVerbFinder(IntCodeComputerPart2 intCodeComputer) {
        this.intCodeComputer = intCodeComputer;
    }

    public int find(String commands, int target) throws Exception {
        return attempt(commands, target, 0, 0);
    }

    private int attempt(String commands, int target, int noun, int verb) throws Exception {
        final String updatedCommands = CommandPreparer.replaceNounAndVerb(commands, noun, verb);
        int result;
        try {
            result = Integer.parseInt(intCodeComputer.run(updatedCommands).split(",")[0]);
        } catch(ArrayIndexOutOfBoundsException e) {
            result = -1;
        }
        if (result == target) {
            return (100 * noun) + verb;
        } else if (noun >= searchLimit && verb >= searchLimit) {
            throw new Exception("Unable to find solution");
        } else if (verb == searchLimit) {
            return attempt(commands, target, noun + 1, 0);
        } else {
            return attempt(commands, target, noun, verb + 1);
        }
    }
}
