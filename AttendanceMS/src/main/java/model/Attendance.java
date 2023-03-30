package model;

public class Attendance {
    int ID;
    int classID;
    int userID;

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getClassID() {
        return classID;
    }

    public void setClassID(int classID) {
        this.classID = classID;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public Attendance(int ID, int classID, int userID) {
        this.ID = ID;
        this.classID = classID;
        this.userID = userID;
    }
}