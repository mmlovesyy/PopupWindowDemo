package main.zhaizu.com.popupwindowdemo.model;

import android.text.Html;
import android.text.Spanned;

/**
 * Created by cmm on 15/10/31.
 */
public class Comment {
    private Spanned comment;

    public Comment(String comment) {
        this.comment = Html.fromHtml("<font color='#4A766E'>zhaizu: </font>" + comment);
    }

    public Spanned getComment() {
        return comment;
    }
}
