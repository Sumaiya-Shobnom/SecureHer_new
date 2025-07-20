package com.example.secureher;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class UploadContactsActivity extends AppCompatActivity {

    EditText nameInput, phoneInput;
    Button addButton;
    RecyclerView recyclerView;

    ArrayList<Contact> contactList = new ArrayList<>();
    ContactItem contactItemAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_upload_contacts);


        nameInput = findViewById(R.id.nameInput);
        phoneInput = findViewById(R.id.phoneInput);
        addButton = findViewById(R.id.addButton);
        recyclerView = findViewById(R.id.recyclerView);


        contactItemAdapter = new ContactItem(contactList);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(contactItemAdapter);


        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name = nameInput.getText().toString().trim();
                String phone = phoneInput.getText().toString().trim();

                if (name.isEmpty() || phone.isEmpty()) {
                    Toast.makeText(UploadContactsActivity.this, "Please enter both name and phone", Toast.LENGTH_SHORT).show();
                } else {
                    Contact newContact = new Contact(name, phone);
                    contactList.add(newContact);
                    contactItemAdapter.notifyDataSetChanged();

                    nameInput.setText("");
                    phoneInput.setText("");
                }
            }
        });
    }
}
