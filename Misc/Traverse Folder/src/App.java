import java.util.ArrayList;

public class App {

    private static boolean traverseTheFolder(FolderNote rootFolder, String string) {

        String nameOfTheFolder = rootFolder.getFolderName();

        if (nameOfTheFolder.equals(string)) {
            return true;
        }

        var childrenFolders = rootFolder.getChildrenFolders();

        if (childrenFolders == null || childrenFolders.isEmpty()) {
            return false;
        }

        var isFound = false;

        for (var folder : childrenFolders) {

            String folderName = folder.getFolderName();
            if (string.equals(folderName)) {
                isFound = true;
                break;
            }

            isFound = traverseTheFolder(folder, string);

            if (isFound)
                break;

        }

        return isFound;
    }

    public static void main(String[] args) {

        FolderNote firstChild = new FolderNote();
        firstChild.setFolderName("First child");

        FolderNote secondChild = new FolderNote();
        secondChild.setFolderName("Second child");

        FolderNote fourthChild = new FolderNote();
        fourthChild.setFolderName("Fourth child");

        FolderNote fifthChild = new FolderNote();
        fifthChild.setFolderName("Fifth child");

        secondChild.setChildrenFolders(new ArrayList<>());
        secondChild.getChildrenFolders().add(fourthChild);
        secondChild.getChildrenFolders().add(fifthChild);

        FolderNote sixthChild = new FolderNote();
        sixthChild.setFolderName("Sixth child");

        firstChild.setChildrenFolders(new ArrayList<>());
        firstChild.getChildrenFolders().add(sixthChild);

        FolderNote rootFolder = new FolderNote();
        rootFolder.setFolderName("Root folder");
        rootFolder.setChildrenFolders(new ArrayList<>());
        rootFolder.getChildrenFolders().add(firstChild);
        rootFolder.getChildrenFolders().add(secondChild);

        boolean didFolderFind = traverseTheFolder(rootFolder, "w child");

        System.out.println("Value of the folder: " + didFolderFind);

    }

}
