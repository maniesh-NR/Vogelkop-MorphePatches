package com.opera.android.infobar;

import android.content.Context;
import android.text.method.LinkMovementMethod;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.material.button.MaterialButton;

/* loaded from: classes.dex */
public class InfoBarLayout extends LinearLayout implements View.OnClickListener {
    public TextView a;
    public MaterialButton b;
    public MaterialButton c;

    public InfoBarLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        TextView textView = (TextView) findViewById(2131363219);
        this.a = textView;
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        this.a.setLinkTextColor(getContext().getColor(2131100356));
        this.b = findViewById(2131362232);
        this.c = findViewById(2131362234);
        this.b.setOnClickListener(this);
        this.c.setOnClickListener(this);
    }
}
