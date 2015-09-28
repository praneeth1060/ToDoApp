package com.example.kpraneeth.todoapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.EditText;

public class EditItemActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_item);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        String todoItem = getIntent().getStringExtra("todoItem");

        EditText etName = (EditText) findViewById(R.id.editText);
        etName.setText(todoItem);
        etName.setSelection(todoItem.length());


        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    public void onSaveItem(View view){
        EditText etName = (EditText) findViewById(R.id.editText);

        Intent data = new Intent();

        data.putExtra("editedItem", etName.getText().toString());
        data.putExtra("position", getIntent().getIntExtra("position", 0));
        data.putExtra("code", 200);

        setResult(RESULT_OK, data);
        finish();
    }

}
