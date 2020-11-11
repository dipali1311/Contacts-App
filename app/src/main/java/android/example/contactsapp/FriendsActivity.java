package android.example.contactsapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class FriendsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_friends);

        final List<ContactsModel> friends = new ArrayList<>();
        friends.add(new ContactsModel("Jack","jack13@yahoo.com","7278637498",R.drawable.male));
        friends.add(new ContactsModel("Sophie","soph77ie@gmail.com","9236778965",R.drawable.female));
        friends.add(new ContactsModel("Sam","ssam111@gmail.com","6678967543",R.drawable.male2));
        friends.add(new ContactsModel("Tom","tom777@rediffmail.com","8756789661",R.drawable.male3));
        friends.add(new ContactsModel("Emma","emma@gmail.com","8800987612",R.drawable.female2));
        friends.add(new ContactsModel("Austin","aus00@rediffmail.com","9445676522",R.drawable.male4));
        friends.add(new ContactsModel("Eleanor","elanor2001@gmail.com","9900129789",R.drawable.female3));
        friends.add(new ContactsModel("Olivia","olive9100@gmail.com","7780122105",R.drawable.female4));
        friends.add(new ContactsModel("Rio","rio@gmail.com","9978761233",R.drawable.male5));
        friends.add(new ContactsModel("Maya","ben@yahoo.com","6654789120",R.drawable.female5));


        RecyclerView friends_recyclerView = findViewById(R.id.recyclerView2);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        friends_recyclerView.setLayoutManager(layoutManager);

        ContactsAdapter contactAdapter = new ContactsAdapter(this,friends,R.color.category_friends);
        friends_recyclerView.setAdapter(contactAdapter);
    }
}