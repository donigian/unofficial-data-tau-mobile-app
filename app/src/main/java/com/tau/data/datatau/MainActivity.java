package com.tau.data.datatau;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.tau.data.datatau.model.NewsArticle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView newsRecyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<NewsArticle> newsArticles = new ArrayList<>();
        newsArticles.add(new NewsArticle("Pandora’s latest quarter disappoints investors",
                "In what has become a very competitive landscape for digital music, early pioneer Pandora is trying to remain a leader. The company reported third quarter..",
                "https://tctechcrunch2011.files.wordpress.com/2016/10/pandora-ios-icon.jpg?w=764&amp;h=400&amp;crop=1",
                "Today",
                "http://social.techcrunch.com/2016/10/25/pandoras-latest-quarter-disappoints-investors/"));

        newsArticles.add(new NewsArticle("This is the new MacBook Pro with the Magic Toolbar mini display",
                "Apple has leaked its own big announcement with two hidden images of its upcoming MacBook Pro in the macOS Sierra 12.1 update. MacRumors first noticed the",
                "https://tctechcrunch2011.files.wordpress.com/2016/10/newmacbookpro1.jpg?w=764&amp;h=400&amp;crop=1",
                "Today",
                "http://social.techcrunch.com/2016/10/25/this-is-the-new-macbook-pro-with-the-magic-toolbar-mini-display/"));

        NewsStore.setNewsArticles(newsArticles);

        newsRecyclerView = (RecyclerView) findViewById(R.id.activity_main_recyclerview);
        newsRecyclerView.setLayoutManager(new LinearLayoutManager(this));

        HomeNewsAdapter homeNewsAdapter = new HomeNewsAdapter(NewsStore.getNewsArticles());
        newsRecyclerView.setAdapter(homeNewsAdapter);
    }
}
