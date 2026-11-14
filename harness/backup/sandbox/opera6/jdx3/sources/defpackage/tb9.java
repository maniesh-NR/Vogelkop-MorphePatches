package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.opera.android.BrowserActivity;
import com.opera.android.annotations.WeakOwner;
import java.util.Collections;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class tb9 extends xb9 {
    public final vk2 m;
    public final wun n;
    public final nb9 o;

    @NonNull
    @WeakOwner
    private final TextView p;
    public final TextView q;
    public final TextView r;
    public final ImageView s;
    public uun t;

    public tb9(BrowserActivity browserActivity, tcl tclVar, View view, String str, rn9 rn9Var, vk2 vk2Var, wun wunVar, nb9 nb9Var) {
        super(browserActivity, tclVar, view, str, rn9Var);
        this.m = vk2Var;
        this.n = wunVar;
        this.o = nb9Var;
        WeakHashMap weakHashMap = r5n.a;
        TextView textView = (TextView) ((View) m5n.f(view, 2131363525));
        this.p = textView;
        this.q = (TextView) ((View) m5n.f(view, 2131363327));
        this.r = (TextView) ((View) m5n.f(view, 2131362512));
        this.s = (ImageView) ((View) m5n.f(view, 2131363933));
        b0(textView);
    }

    @Override // defpackage.xb9, defpackage.ab2
    public final void V(ja2 ja2Var, boolean z) {
        String queryParameter;
        super.V(ja2Var, z);
        final jb9 jb9Var = (jb9) ja2Var;
        String str = jb9Var.e;
        String str2 = jb9Var.f;
        String strK = jb9Var.h;
        String str3 = jb9Var.g;
        p6l p6lVar = p6l.a;
        wun wunVar = this.n;
        tun tunVarB = wunVar.b(str3, p6lVar);
        if (tunVarB != null) {
            String strA = tunVarB.a();
            if (TextUtils.isEmpty(str2) && !TextUtils.isEmpty(strA)) {
                str2 = strA;
            }
            String strC = tunVarB.c();
            if (TextUtils.isEmpty(strK) && !TextUtils.isEmpty(strC)) {
                strK = strC;
            }
            if (TextUtils.isEmpty(strK)) {
                Uri uri = Uri.parse(str3);
                strK = (("www.youtube.com".equals(uri.getHost()) || "m.youtube.com".equals(uri.getHost())) && (queryParameter = uri.getQueryParameter("v")) != null) ? sko.k("https://img.youtube.com/vi/", queryParameter, "/mqdefault.jpg") : null;
            }
            String strE = tunVarB.e();
            if (TextUtils.isEmpty(str) && !TextUtils.isEmpty(strE)) {
                str = strE;
            }
        }
        final byte b = 1;
        if (strK == null && tunVarB == null) {
            uun uunVar = this.t;
            if (uunVar != null) {
                uunVar.b = true;
            }
            this.t = wunVar.a(str3, p6lVar, new esg(this, ja2Var, (byte) 17));
        }
        boolean zIsEmpty = TextUtils.isEmpty(str);
        TextView textView = this.p;
        final byte b2 = 0;
        if (zIsEmpty) {
            textView.setVisibility(8);
        } else {
            textView.setVisibility(0);
            this.p.setText(str);
        }
        TextView textView2 = this.q;
        textView2.setText(str3);
        textView2.setOnClickListener(new View.OnClickListener(this) { // from class: rb9
            public final /* synthetic */ tb9 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                byte b3 = b2;
                jb9 jb9Var2 = jb9Var;
                tb9 tb9Var = this.b;
                switch (b3) {
                    case 0:
                        tb9Var.m.run(jb9Var2.g);
                        break;
                    default:
                        tb9Var.m.run(jb9Var2.g);
                        break;
                }
            }
        });
        View.OnClickListener onClickListener = new View.OnClickListener(this) { // from class: rb9
            public final /* synthetic */ tb9 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                byte b3 = b;
                jb9 jb9Var2 = jb9Var;
                tb9 tb9Var = this.b;
                switch (b3) {
                    case 0:
                        tb9Var.m.run(jb9Var2.g);
                        break;
                    default:
                        tb9Var.m.run(jb9Var2.g);
                        break;
                }
            }
        };
        ImageView imageView = this.s;
        imageView.setOnClickListener(onClickListener);
        textView2.setOnLongClickListener(new View.OnLongClickListener(this) { // from class: sb9
            public final /* synthetic */ tb9 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                byte b3 = b2;
                jb9 jb9Var2 = jb9Var;
                tb9 tb9Var = this.b;
                switch (b3) {
                    case 0:
                        tb9Var.f0(jb9Var2);
                        break;
                    default:
                        tb9Var.f0(jb9Var2);
                        break;
                }
                return true;
            }
        });
        imageView.setOnLongClickListener(new View.OnLongClickListener(this) { // from class: sb9
            public final /* synthetic */ tb9 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                byte b3 = b;
                jb9 jb9Var2 = jb9Var;
                tb9 tb9Var = this.b;
                switch (b3) {
                    case 0:
                        tb9Var.f0(jb9Var2);
                        break;
                    default:
                        tb9Var.f0(jb9Var2);
                        break;
                }
                return true;
            }
        });
        boolean zIsEmpty2 = TextUtils.isEmpty(str2);
        TextView textView3 = this.r;
        if (zIsEmpty2) {
            textView3.setVisibility(8);
        } else {
            textView3.setText(str2);
            textView3.setVisibility(0);
        }
        if (TextUtils.isEmpty(strK)) {
            imageView.setVisibility(8);
            return;
        }
        imageView.setVisibility(0);
        dwh dwhVarI = yne.b.i(strK);
        dwhVarI.d = true;
        dwhVarI.a();
        dwhVarI.m(wqm.r(strK) ? Collections.singletonList(this.o) : Collections.EMPTY_LIST);
        dwhVarI.b.k = true;
        dwhVarI.g(imageView, (d94) null);
    }

    @Override // defpackage.xb9, defpackage.ab2
    public final void Y() {
        super.Y();
        uun uunVar = this.t;
        if (uunVar != null) {
            uunVar.b = true;
            this.t = null;
        }
    }

    @Override // defpackage.xb9
    public final void f0(ja2 ja2Var) {
        nej nejVarF = a4h.f(this.d);
        xq3 xq3Var = new xq3((byte) 4, this, ja2Var, false);
        nejVarF.getClass();
        nejVarF.b(xq3Var, ijm.b);
    }
}
