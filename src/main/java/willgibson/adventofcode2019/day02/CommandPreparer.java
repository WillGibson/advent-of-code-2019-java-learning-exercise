package willgibson.adventofcode2019.day02;

public class CommandPreparer {
    public static String replaceNounAndVerb(String commands, int noun, int verb) {
        final String[] commandsArray = commands.split(",");
        commandsArray[1] = Integer.toString(noun);
        commandsArray[2] = Integer.toString(verb);
        return String.join(",", commandsArray);
    }
}
