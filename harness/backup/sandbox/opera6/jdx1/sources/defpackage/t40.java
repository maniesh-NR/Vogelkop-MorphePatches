package defpackage;

import android.content.Context;
import android.net.http.QuicException;
import android.os.Handler;
import android.os.SystemClock;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import com.opera.android.custom_views.SeparatorView;
import com.opera.android.ui.catalog.widget.OperaListItem;
import com.opera.android.widget.MenuSettingsListItem;
import java.security.GeneralSecurityException;
import java.util.ConcurrentModificationException;
import kotlin.Unit;

/* loaded from: classes.dex */
public final /* synthetic */ class t40 implements cvb, lo7, n5o, jtl, bqb, y62, i82, fjc {
    public final /* synthetic */ byte a;

    public /* synthetic */ t40(byte b) {
        this.a = b;
    }

    public static /* synthetic */ void e() {
        throw new ConcurrentModificationException();
    }

    public static /* synthetic */ void f(Object obj, String str) {
        throw new RuntimeException(str + obj);
    }

    public static /* synthetic */ void h() {
        throw new AssertionError();
    }

    public static /* bridge */ /* synthetic */ boolean j(Object obj) {
        return obj instanceof QuicException;
    }

    private final void m(tw7 tw7Var) {
    }

    @Override // defpackage.y62
    public final int b(int i, d2c d2cVar) {
        switch (this.a) {
            case 18:
                return Math.round((1.0f - 1.0f) * ((i + 0) / 2.0f));
            default:
                return Math.round((1.0f + (d2cVar != d2c.a ? 1.0f : -1.0f)) * (i / 2.0f));
        }
    }

    public final j82 d(oqe oqeVar) {
        throw new UnsupportedOperationException("Should never be called");
    }

    @Override // defpackage.n5o
    public final Object g(Object obj) {
        ac8.a(new ps1());
        return Unit.a;
    }

    public final oup i(l2j l2jVar) throws GeneralSecurityException {
        r6h r6hVar = (r6h) l2jVar;
        if (!r6hVar.a.equals("type.googleapis.com/google.crypto.tink.AesGcmSivKey")) {
            qp2.o("Wrong type URL in call to AesGcmSivProtoSerialization.parseKey");
            return null;
        }
        try {
            m40 m40VarY = m40.y(r6hVar.c, xk8.a());
            if (m40VarY.w() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            c37 c37VarB = s40.b();
            c37VarB.B(m40VarY.v().size());
            c37VarB.b = u40.b(r6hVar.e);
            s40 s40VarH = c37VarB.h();
            l45 l45Var = new l45();
            l45Var.b = null;
            l45Var.c = null;
            l45Var.a = s40VarH;
            l45Var.b = new i4d(m54.a(m40VarY.v().j()), (byte) 24);
            l45Var.c = r6hVar.f;
            return l45Var.l();
        } catch (ajb unused) {
            t3p.w("Parsing AesGcmSivKey failed");
            return null;
        }
    }

    public final void invoke(Object obj) {
        long jU;
        qq6 qq6Var;
        ti8 ti8Var;
        jx6 jx6Var;
        switch (this.a) {
            case 25:
                il6 il6Var = (il6) obj;
                ll6 ll6Var = il6Var.a;
                if (il6Var != ll6Var.j || ll6Var.n == null) {
                    return;
                }
                jl6 jl6Var = ll6Var.p;
                int i = jl6Var.c;
                if (i != -1) {
                    long j = ((yg2) jl6Var.f).f / i;
                    th2 th2Var = ll6Var.t;
                    th2Var.getClass();
                    jU = tym.U(th2Var.a.getSampleRate(), j);
                } else {
                    jU = -9223372036854775807L;
                }
                long jElapsedRealtime = SystemClock.elapsedRealtime() - ll6Var.W;
                qq6 qq6Var2 = ll6Var.n;
                int i2 = ((yg2) ll6Var.p.f).f;
                long jC0 = tym.c0(jU);
                pad padVar = ((kgd) qq6Var2.b).E0;
                Handler handler = (Handler) padVar.b;
                if (handler != null) {
                    handler.post(new fh2(padVar, i2, jC0, jElapsedRealtime));
                    return;
                }
                return;
            case 26:
                il6 il6Var2 = (il6) obj;
                il6Var2.getClass();
                ll6.c0.getAndDecrement();
                qq6 qq6Var3 = il6Var2.a.n;
                if (qq6Var3 != null) {
                    y55 y55Var = new y55();
                    pad padVar2 = ((kgd) qq6Var3.b).E0;
                    Handler handler2 = (Handler) padVar2.b;
                    if (handler2 != null) {
                        handler2.post(new fh2(padVar2, (Object) y55Var, (byte) 3));
                        return;
                    }
                    return;
                }
                return;
            case 27:
                il6 il6Var3 = (il6) obj;
                ll6 ll6Var2 = il6Var3.a;
                if (il6Var3 != ll6Var2.j || (qq6Var = ll6Var2.n) == null || !ll6Var2.O || (ti8Var = ((kgd) qq6Var.b).G) == null) {
                    return;
                }
                ti8Var.a();
                return;
            case 28:
                il6 il6Var4 = (il6) obj;
                ll6 ll6Var3 = il6Var4.a;
                if (il6Var4 == ll6Var3.j) {
                    ll6Var3.N = true;
                    return;
                }
                return;
            default:
                qq6 qq6Var4 = ((hl6) obj).a.n;
                if (qq6Var4 != null) {
                    kgd kgdVar = (kgd) qq6Var4.b;
                    synchronized (kgdVar.a) {
                        jx6Var = kgdVar.r;
                    }
                    if (jx6Var != null) {
                        synchronized (jx6Var.d) {
                            jx6Var.g.getClass();
                        }
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public final Object k(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        switch (this.a) {
            case 15:
                View viewInflate = layoutInflater.inflate(2131558871, viewGroup, false);
                viewGroup.addView(viewInflate);
                int i = 2131364246;
                MenuSettingsListItem menuSettingsListItem = (MenuSettingsListItem) w1h.j(2131364246, viewInflate);
                if (menuSettingsListItem != null) {
                    i = 2131364255;
                    OperaListItem operaListItemJ = w1h.j(2131364255, viewInflate);
                    if (operaListItemJ != null) {
                        i = 2131364260;
                        OperaListItem operaListItemJ2 = w1h.j(2131364260, viewInflate);
                        if (operaListItemJ2 != null) {
                            i = 2131364261;
                            OperaListItem operaListItemJ3 = w1h.j(2131364261, viewInflate);
                            if (operaListItemJ3 != null) {
                                i = 2131364266;
                                OperaListItem operaListItemJ4 = w1h.j(2131364266, viewInflate);
                                if (operaListItemJ4 != null) {
                                    i = 2131364294;
                                    OperaListItem operaListItemJ5 = w1h.j(2131364294, viewInflate);
                                    if (operaListItemJ5 != null) {
                                        i = 2131364296;
                                        MenuSettingsListItem menuSettingsListItem2 = (MenuSettingsListItem) w1h.j(2131364296, viewInflate);
                                        if (menuSettingsListItem2 != null) {
                                            i = 2131364309;
                                            LinearLayout linearLayout = (LinearLayout) w1h.j(2131364309, viewInflate);
                                            if (linearLayout != null) {
                                                i = 2131364318;
                                                OperaListItem operaListItemJ6 = w1h.j(2131364318, viewInflate);
                                                if (operaListItemJ6 != null) {
                                                    i = 2131364320;
                                                    FrameLayout frameLayout = (FrameLayout) w1h.j(2131364320, viewInflate);
                                                    if (frameLayout != null) {
                                                        i = 2131364343;
                                                        OperaListItem operaListItemJ7 = w1h.j(2131364343, viewInflate);
                                                        if (operaListItemJ7 != null) {
                                                            i = 2131364370;
                                                            RecyclerView recyclerView = (RecyclerView) w1h.j(2131364370, viewInflate);
                                                            if (recyclerView != null) {
                                                                i = 2131364371;
                                                                RecyclerView recyclerView2 = (RecyclerView) w1h.j(2131364371, viewInflate);
                                                                if (recyclerView2 != null) {
                                                                    i = 2131364372;
                                                                    if (w1h.j(2131364372, viewInflate) != null) {
                                                                        i = 2131364373;
                                                                        OperaListItem operaListItemJ8 = w1h.j(2131364373, viewInflate);
                                                                        if (operaListItemJ8 != null) {
                                                                            i = 2131364379;
                                                                            OperaListItem operaListItemJ9 = w1h.j(2131364379, viewInflate);
                                                                            if (operaListItemJ9 != null) {
                                                                                break;
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                t3p.q("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
                break;
            default:
                View viewInflate2 = layoutInflater.inflate(2131558872, viewGroup, false);
                viewGroup.addView(viewInflate2);
                int i2 = 2131362063;
                OperaListItem operaListItemJ10 = w1h.j(2131362063, viewInflate2);
                if (operaListItemJ10 != null) {
                    i2 = 2131362064;
                    SeparatorView separatorViewJ = w1h.j(2131362064, viewInflate2);
                    if (separatorViewJ != null) {
                        i2 = 2131362695;
                        LinearLayout linearLayout2 = (LinearLayout) w1h.j(2131362695, viewInflate2);
                        if (linearLayout2 != null) {
                            i2 = 2131364257;
                            OperaListItem operaListItemJ11 = w1h.j(2131364257, viewInflate2);
                            if (operaListItemJ11 != null) {
                                i2 = 2131364264;
                                OperaListItem operaListItemJ12 = w1h.j(2131364264, viewInflate2);
                                if (operaListItemJ12 != null) {
                                    i2 = 2131364285;
                                    if (w1h.j(2131364285, viewInflate2) != null) {
                                        i2 = 2131364286;
                                        OperaListItem operaListItemJ13 = w1h.j(2131364286, viewInflate2);
                                        if (operaListItemJ13 != null) {
                                            i2 = 2131364289;
                                            OperaListItem operaListItemJ14 = w1h.j(2131364289, viewInflate2);
                                            if (operaListItemJ14 != null) {
                                                i2 = 2131364303;
                                                SeparatorView separatorViewJ2 = w1h.j(2131364303, viewInflate2);
                                                if (separatorViewJ2 != null) {
                                                    i2 = 2131364305;
                                                    OperaListItem operaListItemJ15 = w1h.j(2131364305, viewInflate2);
                                                    if (operaListItemJ15 != null) {
                                                        i2 = 2131364306;
                                                        if (w1h.j(2131364306, viewInflate2) != null) {
                                                            i2 = 2131364351;
                                                            if (w1h.j(2131364351, viewInflate2) != null) {
                                                                i2 = 2131364361;
                                                                MaterialButton materialButtonJ = w1h.j(2131364361, viewInflate2);
                                                                if (materialButtonJ != null) {
                                                                    i2 = 2131364362;
                                                                    MaterialButton materialButtonJ2 = w1h.j(2131364362, viewInflate2);
                                                                    if (materialButtonJ2 != null) {
                                                                        i2 = 2131364363;
                                                                        OperaListItem operaListItemJ16 = w1h.j(2131364363, viewInflate2);
                                                                        if (operaListItemJ16 != null) {
                                                                            i2 = 2131364364;
                                                                            MaterialButton materialButtonJ3 = w1h.j(2131364364, viewInflate2);
                                                                            if (materialButtonJ3 != null) {
                                                                                i2 = 2131364365;
                                                                                MaterialButton materialButtonJ4 = w1h.j(2131364365, viewInflate2);
                                                                                if (materialButtonJ4 != null) {
                                                                                    i2 = 2131364366;
                                                                                    SeparatorView separatorViewJ3 = w1h.j(2131364366, viewInflate2);
                                                                                    if (separatorViewJ3 != null) {
                                                                                        i2 = 2131364367;
                                                                                        MaterialButton materialButtonJ5 = w1h.j(2131364367, viewInflate2);
                                                                                        if (materialButtonJ5 != null) {
                                                                                            i2 = 2131364368;
                                                                                            MaterialButton materialButtonJ6 = w1h.j(2131364368, viewInflate2);
                                                                                            if (materialButtonJ6 != null) {
                                                                                                i2 = 2131365081;
                                                                                                OperaListItem operaListItemJ17 = w1h.j(2131365081, viewInflate2);
                                                                                                if (operaListItemJ17 != null) {
                                                                                                    break;
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                t3p.q("Missing required view with ID: ".concat(viewInflate2.getResources().getResourceName(i2)));
                break;
        }
        return null;
    }

    public final void n(tw7 tw7Var) {
        switch (this.a) {
            case 16:
                break;
            default:
                if (!(tw7Var instanceof rw7)) {
                    if (!(tw7Var instanceof sw7)) {
                        h9o.p();
                        break;
                    } else {
                        break;
                    }
                } else {
                    break;
                }
        }
    }

    public final no7 x(Context context) {
        return new mv0(context, mv0.m, "assistant");
    }
}
