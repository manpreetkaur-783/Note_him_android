package com.him.note_him_android.database;

public class Subject {
    public static final String TABLE_NAME = "subject";

    public static final String COLUMN_ID = "id";
    public static final String COLUMN_SUBJECT = "subejct";
    String subject;
    int id;
    // Create table SQL query
    public static final String CREATE_TABLE =
            "CREATE TABLE " + TABLE_NAME + "("
                    + COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT,"
                    + COLUMN_SUBJECT + " TEXT"
                    + ")";

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
}
