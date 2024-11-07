package seedu.commands;

import seedu.exceptions.InvalidIndex;

import java.util.ArrayList;
//@@author jadenlimjc
public class DeleteCommand extends Command {
    @Override
    public void execute (ArrayList<String> args) {
        try {
            int id = Integer.parseInt(args.get(0));
            int index = id - 1;
            internships.removeInternship(index);
        } catch (NumberFormatException e) {
            uiCommand.showOutput("Invalid integer, please provide a valid internship ID");
        } catch (InvalidIndex ie) {
            uiCommand.showOutput(ie.getMessage());
        }
    }

    @Override
    public String getUsage() {
        return """
                delete
                Usage: delete {ID}""";
    }
}
