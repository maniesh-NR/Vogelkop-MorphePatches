package com.opera.android.browser.chromium;

import android.content.Context;
import android.content.res.Configuration;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.widget.RelativeLayout;

/* loaded from: classes.dex */
public class TabCrashView extends RelativeLayout {
    public static final /* synthetic */ int h = 0;
    public cy3 a;
    public float b;
    public float c;
    public final boolean d;
    public boolean e;
    public int f;
    public final Context g;

    public TabCrashView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.d = true;
        this.g = context;
        this.f = context.getResources().getConfiguration().orientation;
        removeAllViews();
        LayoutInflater.from(context).inflate(2131558600, (ViewGroup) this, true);
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        int i = this.f;
        int i2 = configuration.orientation;
        if (i != i2) {
            this.f = i2;
            removeAllViews();
            LayoutInflater.from(this.g).inflate(2131558600, (ViewGroup) this, true);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        boolean z = this.d;
        if (action == 0) {
            if (z) {
                this.a.start(0, 0);
                this.e = true;
            }
            this.b = motionEvent.getY();
            this.c = 0.0f;
            return true;
        }
        if (action == 1) {
            this.a.release(this.c > ((float) getHeight()) * 0.33f ? 1 : 0);
            this.e = false;
            return true;
        }
        if (action != 2) {
            this.a.release(3);
            this.e = false;
            return true;
        }
        if (z && !this.e) {
            this.a.start(0, 0);
            this.e = true;
        }
        float y = motionEvent.getY() - this.b;
        this.a.pull(0.0f, y);
        this.c += y;
        this.b = motionEvent.getY();
        return true;
    }
}
