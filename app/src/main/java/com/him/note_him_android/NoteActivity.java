package com.him.note_him_android;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.him.note_him_android.adapter.SubjectAdapter;
import com.him.note_him_android.database.DatabaseHelper;

public class NoteActivity extends AppCompatActivity {
    DatabaseHelper databaseHelper;
    FloatingActionButton addNote;
    RecyclerView noteRecycler;
    SubjectAdapter subjectAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_note);
        databaseHelper = new DatabaseHelper(this);
        noteRecycler = findViewById(R.id.noteRecycler);
        addNote = findViewById(R.id.addNote);
    }
}
