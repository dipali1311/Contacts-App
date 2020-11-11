package android.example.contactsapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class FamilyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_family);

        final List<ContactsModel> family = new ArrayList<>();
        family.add(new ContactsModel("Mom","anika11@gmail.com","9826734891",R.drawable.female));
        family.add(new ContactsModel("Dad","kabir@yahoo.com","9900129775",R.drawable.male));
        family.add(new ContactsModel("Bro","rudrak@gmail.com","8296397678",R.drawable.male3));
        family.add(new ContactsModel("Sis","tanvik@gmail.com","7712980760",R.drawable.female3));
        family.add(new ContactsModel("Grandpa","vihaan12345@yahoo.com","7564839209",R.drawable.male2));
        family.add(new ContactsModel("Granny","sahana1992@gmail.com","9826734891",R.drawable.female2));
        family.add(new ContactsModel("Sneha","snehaprasad@rediffmail.com","6264780987",R.drawable.female4));
        family.add(new ContactsModel("Ved","ved2001@gmail.com","8892871234",R.drawable.male4));
        family.add(new ContactsModel("Aunt","ananya@gmail.com","8484897031",R.drawable.female5));
        family.add(new ContactsModel("Uncle","shubham77@gmail.com","9822314800",R.drawable.male5));

        RecyclerView family_recyclerView = findViewById(R.id.recyclerView3);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        family_recyclerView.setLayoutManager(layoutManager);

        ContactsAdapter contactAdapter =new ContactsAdapter(this,family,R.color.category_family);
        family_recyclerView.setAdapter(contactAdapter);
    }
}