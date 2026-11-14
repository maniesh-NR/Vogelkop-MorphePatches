package com.opera.android.startup;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.opera.android.OperaApplication;
import com.opera.android.custom_views.LayoutDirectionFrameLayout;
import com.opera.android.startup.ContentWrapperLayout;
import defpackage.jng;
import defpackage.khh;
import defpackage.kl0;

/* loaded from: classes.dex */
public class ContentWrapperLayout extends LayoutDirectionFrameLayout {
    public static final /* synthetic */ int e = 0;
    public final int c;
    public kl0 d;

    public ContentWrapperLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, khh.i, 0, 0);
        this.c = typedArrayObtainStyledAttributes.getResourceId(1, 0);
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View
    public final void onFinishInflate() throws Resources.NotFoundException {
        super.onFinishInflate();
        final byte b = 1;
        LayoutInflater.from(getContext()).inflate(2131559177, (ViewGroup) this, true);
        final TextView textView = (TextView) findViewById(2131364706);
        String string = textView.getResources().getString(2132021636);
        Context context = textView.getContext();
        final Object[] objArr = 0 == true ? 1 : 0;
        phj.u0(textView, n1h.d(string, new owj[]{new owj("<tos>", "</tos>", new jng(3, context, new Runnable(this) { // from class: zr5
            public final /* synthetic */ ContentWrapperLayout b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                byte b2 = objArr;
                TextView textView2 = textView;
                ContentWrapperLayout contentWrapperLayout = this.b;
                switch (b2) {
                    case 0:
                        int i = ContentWrapperLayout.e;
                        if (contentWrapperLayout.d != null) {
                            Context context2 = textView2.getContext();
                            String[] strArr = OperaApplication.K;
                            wsf wsfVar = ((OperaApplication) context2.getApplicationContext()).L().g;
                            wsfVar.a(new vsf(wsfVar, contentWrapperLayout.d, (byte) 1));
                            break;
                        }
                        break;
                    default:
                        int i2 = ContentWrapperLayout.e;
                        if (contentWrapperLayout.d != null) {
                            Context context3 = textView2.getContext();
                            String[] strArr2 = OperaApplication.K;
                            wsf wsfVar2 = ((OperaApplication) context3.getApplicationContext()).L().g;
                            wsfVar2.a(new vsf(wsfVar2, contentWrapperLayout.d, (byte) 0));
                            break;
                        }
                        break;
                }
            }
        })), new owj("<privacy>", "</privacy>", new jng(2, textView.getContext(), new Runnable(this) { // from class: zr5
            public final /* synthetic */ ContentWrapperLayout b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                byte b2 = b;
                TextView textView2 = textView;
                ContentWrapperLayout contentWrapperLayout = this.b;
                switch (b2) {
                    case 0:
                        int i = ContentWrapperLayout.e;
                        if (contentWrapperLayout.d != null) {
                            Context context2 = textView2.getContext();
                            String[] strArr = OperaApplication.K;
                            wsf wsfVar = ((OperaApplication) context2.getApplicationContext()).L().g;
                            wsfVar.a(new vsf(wsfVar, contentWrapperLayout.d, (byte) 1));
                            break;
                        }
                        break;
                    default:
                        int i2 = ContentWrapperLayout.e;
                        if (contentWrapperLayout.d != null) {
                            Context context3 = textView2.getContext();
                            String[] strArr2 = OperaApplication.K;
                            wsf wsfVar2 = ((OperaApplication) context3.getApplicationContext()).L().g;
                            wsfVar2.a(new vsf(wsfVar2, contentWrapperLayout.d, (byte) 0));
                            break;
                        }
                        break;
                }
            }
        }))}));
        int i = this.c;
        findViewById(i).setVisibility(0);
        if (i == 2131364706) {
            for (int i2 = 0; i2 < getChildCount(); i2++) {
                View childAt = getChildAt(i2);
                if (childAt.getId() != 2131364706) {
                    childAt.setVisibility(8);
                }
            }
        }
    }
}
