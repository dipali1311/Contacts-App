package android.example.contactsapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class WorkActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_work);

        final List<ContactsModel> work = new ArrayList<>();
        work.add(new ContactsModel("Harry","Harry@gmail.com","6749382906",R.drawable.male));
        work.add(new ContactsModel("Potter","Potter@gmail.com","6749382906",R.drawable.male2));
        work.add(new ContactsModel("Jack","Jack@gmail.com","6749382906",R.drawable.male3));
        work.add(new ContactsModel("Bill","Bill@gmail.com","6749382906",R.drawable.male4));
        work.add(new ContactsModel("Root","Root@gmail.com","6749382906",R.drawable.male5));
        work.add(new ContactsModel("Meg","Meg@gmail.com","6749382906",R.drawable.female));
        work.add(new ContactsModel("Jess","Jess@gmail.com","6749382906",R.drawable.female2));
        work.add(new ContactsModel("Megan","Megan@gmail.com","6749382906",R.drawable.female3));
        work.add(new ContactsModel("Rachael","Rachael@gmail.com","6749382906",R.drawable.female4));
        work.add(new ContactsModel("Sophie","Sophie@gmail.com","6749382906",R.drawable.female5));


        RecyclerView work_recyclerView = findViewById(R.id.recyclerView1);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        work_recyclerView.setLayoutManager(layoutManager);

        ContactsAdapter contactAdapter = new ContactsAdapter(this,work,R.color.category_work);
        work_recyclerView.setAdapter(contactAdapter);
    }
}