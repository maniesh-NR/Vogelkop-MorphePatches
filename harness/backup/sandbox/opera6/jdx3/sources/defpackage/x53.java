package defpackage;

import android.content.SharedPreferences;
import com.opera.android.feed.FeedViewPager;

/* loaded from: classes.dex */
public final class x53 extends n1 {
    public final /* synthetic */ byte c = 2;
    public final /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x53(c5k c5kVar) {
        super(ru9.g);
        this.d = c5kVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x53(dfn dfnVar) {
        super(ru9.l);
        this.d = dfnVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x53(e8k e8kVar) {
        super(ru9.i);
        this.d = e8kVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x53(ggn ggnVar) {
        super(ru9.l);
        this.d = ggnVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x53(hlk hlkVar) {
        super(ru9.l);
        this.d = hlkVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x53(u1f u1fVar) {
        super(ru9.k);
        this.d = u1fVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x53(y53 y53Var) {
        super(ru9.f);
        this.d = y53Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x53(ydn ydnVar) {
        super(ru9.l);
        this.d = ydnVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x53(yen yenVar) {
        super(ru9.c);
        this.d = yenVar;
    }

    @Override // defpackage.n1
    public final void x0(ou9 ou9Var) {
        int iA;
        int iR;
        byte b = this.c;
        Object obj = this.d;
        switch (b) {
            case 0:
                ((y53) obj).l.r(Boolean.valueOf(!r3.p.a.getBoolean(((ou9) ((lu9) ou9Var)).a, true)));
                break;
            case 1:
                ((u1f) obj).b();
                break;
            case 2:
                c5k c5kVar = (c5k) obj;
                ru9 ru9Var = c5kVar.X;
                FeedViewPager feedViewPager = c5kVar.B;
                String string = ru9Var.a.getString(((ou9) ((qu9) ou9Var)).a, null);
                if (string != null && (iA = c5kVar.A.a(string)) != -1 && (iR = feedViewPager.r(iA)) != feedViewPager.getCurrentItem()) {
                    feedViewPager.setCurrentItem(iR);
                    break;
                }
                break;
            case 3:
                ((e8k) obj).R();
                break;
            case 4:
                ((hlk) obj).g();
                break;
            case 5:
                ydn ydnVar = (ydn) obj;
                ydnVar.J(new wdn(ydnVar));
                ydnVar.E(ydnVar.T);
                break;
            case 6:
                yen yenVar = (yen) obj;
                yenVar.j.r(Boolean.valueOf(yenVar.e(yenVar.g)));
                break;
            case 7:
                ru9 ru9Var2 = ((dfn) obj).a;
                if (!ru9Var2.a.getBoolean("vpn_pro.kill_switch.on", false)) {
                    nv6 nv6VarB = ru9Var2.b();
                    SharedPreferences.Editor editor = (SharedPreferences.Editor) nv6VarB.a;
                    editor.remove("vpn_pro.kill_switch.activated_timestamp");
                    editor.remove("vpn_pro.reminder.show_count");
                    nv6VarB.w();
                    break;
                } else if (!ru9Var2.a.contains("vpn_pro.kill_switch.activated_timestamp")) {
                    nv6 nv6VarB2 = ru9Var2.b();
                    ((SharedPreferences.Editor) nv6VarB2.a).putLong("vpn_pro.kill_switch.activated_timestamp", System.currentTimeMillis());
                    nv6VarB2.w();
                    break;
                }
                break;
            default:
                ((ggn) obj).a();
                break;
        }
    }
}
