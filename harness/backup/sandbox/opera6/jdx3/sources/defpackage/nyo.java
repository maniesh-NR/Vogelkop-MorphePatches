package defpackage;

import android.content.Context;
import android.view.View;
import android.webkit.WebView;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class nyo extends WebView {
    public static final /* synthetic */ int f = 0;
    public final ArrayList a;
    public boolean b;
    public byte c;
    public long d;
    public boolean e;

    public nyo(Context context) {
        super(context);
        this.a = new ArrayList();
        this.c = (byte) 1;
    }

    @Override // android.webkit.WebView, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.c == 1) {
            this.c = (byte) 2;
            ArrayList arrayList = this.a;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                if (obj != null) {
                    ((h9p) obj).a.v(this);
                }
            }
        }
    }

    @Override // android.webkit.WebView
    public final void onPause() {
        super.onPause();
        this.b = true;
    }

    @Override // android.webkit.WebView
    public final void onResume() {
        this.b = false;
        super.onResume();
    }

    @Override // android.webkit.WebView, android.view.View
    public final void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        if (i != 0 && !this.b) {
            onPause();
        } else if (this.b) {
            onResume();
        }
    }
}
