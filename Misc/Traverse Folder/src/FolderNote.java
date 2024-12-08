import java.util.ArrayList;

public class FolderNote {

    private String folderName;

    public String getFolderName() {
        return folderName;
    }

    public void setFolderName(String folderName) {
        this.folderName = folderName;
    }

    private ArrayList<FolderNote> childrenFolders;

    public ArrayList<FolderNote> getChildrenFolders() {
        return childrenFolders;
    }

    public void setChildrenFolders(ArrayList<FolderNote> childrenFolders) {
        this.childrenFolders = childrenFolders;
    }

    private String[] files;

    public String[] getFiles() {
        return files;
    }

    public void setFiles(String[] files) {
        this.files = files;
    }

}