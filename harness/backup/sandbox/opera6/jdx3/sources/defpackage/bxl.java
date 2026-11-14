package defpackage;

import android.content.Context;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.i;
import com.google.android.material.button.MaterialButton;
import com.google.firebase.datatransport.TransportRegistrar;
import com.opera.android.custom_views.StylingImageView;
import com.opera.android.custom_views.StylingTextView;
import org.chromium.content.browser.webcontents.WebContentsImpl;

/* loaded from: classes.dex */
public final /* synthetic */ class bxl implements ih4, ee5, fn8, q5n, urg, ktn, p9n, lo7, xjj, yjj {
    public static final bxl b = new bxl((byte) 1);
    public static final bxl c = new bxl((byte) 2);
    public static final bxl d = new bxl((byte) 3);
    public static final bxl e = new bxl((byte) 4);
    public static final bxl f = new bxl((byte) 5);
    public final /* synthetic */ byte a;

    public /* synthetic */ bxl(byte b2) {
        this.a = b2;
    }

    public /* synthetic */ bxl(uim uimVar) {
        this.a = (byte) 14;
    }

    public static /* synthetic */ void a(int i, StringBuilder sb) {
        sb.append(i);
        throw new IllegalArgumentException(sb.toString().toString());
    }

    public static /* synthetic */ void b(long j, String str) {
        throw new IllegalArgumentException(str + j);
    }

    public static /* synthetic */ void d(Object obj) {
        throw new IllegalArgumentException(obj.toString());
    }

    public static /* synthetic */ void g(Object obj, String str) {
        throw new UnsupportedOperationException(str + obj);
    }

    public static /* synthetic */ void j(String str, Object obj, Throwable th) {
        throw new UnsupportedOperationException(str + obj, th);
    }

    public static /* synthetic */ void k(StringBuilder sb, Object obj) {
        sb.append(obj);
        throw new IllegalStateException(sb.toString());
    }

    public static /* synthetic */ void l(Object obj, String str) {
        throw new UnsupportedOperationException(str + obj);
    }

    @Override // defpackage.yjj
    public final i c(ViewGroup viewGroup) {
        yq1 yq1VarN = j7c.n(viewGroup, 2131559538, viewGroup, false);
        if (yq1VarN != null) {
            return new p6n(new cq3((View) yq1VarN, (byte) 7));
        }
        t3p.q("rootView");
        return null;
    }

    @Override // defpackage.ih4
    public final void cancel() {
    }

    @Override // defpackage.fn8
    public final cn8[] createExtractors() {
        pql pqlVar = new pql(0L);
        a1b a1bVar = h1b.b;
        return new cn8[]{new p7m(1, 1, tnk.Ap, pqlVar, new gl(0, csh.e))};
    }

    public final Object e(WebContentsImpl webContentsImpl) {
        switch (this.a) {
            case 19:
                return new b6n(webContentsImpl);
            default:
                return new d6n();
        }
    }

    @Override // defpackage.p9n
    public final void h(View view) {
        u8n u8nVar = (u8n) view.getTag(2131365014);
        if (u8nVar != null) {
            u8nVar.c = 0;
        }
    }

    @Override // defpackage.xjj
    public final void i(Object obj, i iVar) {
        switch (this.a) {
            case 25:
                r6n r6nVar = (r6n) iVar;
                vs vsVar = r6nVar.b;
                ((StylingImageView) vsVar.c).setImageResource(2131232305);
                ((StylingTextView) vsVar.e).setText(2132022344);
                MaterialButton materialButton = (MaterialButton) vsVar.d;
                materialButton.setText(2132020924);
                materialButton.setOnClickListener(new pkm(r6nVar, (byte) 2));
                break;
            case 26:
                t6n t6nVar = (t6n) iVar;
                t6nVar.U(t6nVar.c.d());
                break;
            case 27:
                kkb kkbVar = (kkb) obj;
                w6n w6nVar = (w6n) iVar;
                w6nVar.getClass();
                w6nVar.d = kkbVar.b;
                pyl pylVar = w6nVar.e;
                aln alnVar = kkbVar.a;
                pylVar.c = alnVar;
                pyl.i(((View) pylVar.d).getContext(), alnVar, (View) pylVar.d, (agm) pylVar.e, pylVar.b, ((tjn) pylVar.f).a());
                w6nVar.b.c.setText(am2.b(w6nVar.d));
                break;
            default:
                bt1 bt1Var = ((x6n) iVar).d;
                bt1Var.d.setImageResource(2131232080);
                bt1Var.c.setText(2132022341);
                break;
        }
    }

    public final boolean onUnhandledKeyEvent(View view, KeyEvent keyEvent) {
        return c37.r().l(3, keyEvent);
    }

    public final Object r(x79 x79Var) {
        switch (this.a) {
            case 7:
                return TransportRegistrar.c(x79Var);
            case 8:
                return TransportRegistrar.b(x79Var);
            default:
                return TransportRegistrar.a(x79Var);
        }
    }

    @Override // defpackage.urg
    public final boolean test(Object obj) {
        kqm kqmVar = (kqm) obj;
        if (kqmVar != null) {
            return kqmVar.b.isEmpty() && kqmVar.d.b() < 3;
        }
        return true;
    }

    @Override // defpackage.lo7
    public final no7 x(Context context) {
        switch (this.a) {
            case 23:
                return new ufn(context, 17, "vpn_settings");
            default:
                return new bjn(context, 17, "wallet_settings");
        }
    }
}
