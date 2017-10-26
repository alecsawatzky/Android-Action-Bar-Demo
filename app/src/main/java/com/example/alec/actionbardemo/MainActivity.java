package com.example.alec.actionbardemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
{
    private TextView mainText;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mainText = (TextView) findViewById(R.id.tvMain);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu, menu);
        setTitle("Action Bar Demo");
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item)
    {
        String topic;
        switch (item.getItemId())
        {
            case R.id.actionRefresh:
                Toast.makeText(this, "Refreshing Feed!", Toast.LENGTH_SHORT).show();
                break;
            case R.id.actionSubFeedTopStories:
                topic = "Top Stories";
                Toast.makeText(this, topic, Toast.LENGTH_SHORT).show();
                mainText.setText(topic);
                setTitle(topic);
                break;
            case R.id.actionSubFeedWorldNews:
                topic = "World News";
                Toast.makeText(this, topic, Toast.LENGTH_SHORT).show();
                mainText.setText(topic);
                setTitle(topic);
                break;
            case R.id.actionSubFeedPolitics:
                topic = "Politics";
                Toast.makeText(this, "Politics", Toast.LENGTH_SHORT).show();
                mainText.setText(topic);
                setTitle(topic);
                break;
            case R.id.action_setting:
                Toast.makeText(this, "Settings", Toast.LENGTH_SHORT).show();
        }

        return super.onOptionsItemSelected(item);
    }
}