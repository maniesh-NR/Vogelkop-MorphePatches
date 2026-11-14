package defpackage;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.util.Pair;
import android.view.KeyEvent;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.fragment.app.a;
import androidx.fragment.app.w;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.i;
import com.opera.android.OperaApplication;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class p77 implements w6f {
    public final /* synthetic */ byte a;
    public final i7f b;
    public final KeyEvent.Callback c;
    public Object d;

    public p77(RecyclerView recyclerView, pde pdeVar, pde pdeVar2, pde pdeVar3, pde pdeVar4) {
        final byte b = 1;
        this.a = (byte) 1;
        this.c = recyclerView;
        this.b = new i7f();
        this.d = new LinkedHashSet();
        final byte b2 = 0;
        a26.T(pdeVar2, pdeVar, new f7f(this) { // from class: a6l
            public final /* synthetic */ p77 b;

            {
                this.b = this;
            }

            public final void d0(Object obj) {
                byte b3 = b2;
                p77 p77Var = this.b;
                switch (b3) {
                    case 0:
                        final Set set = (Set) obj;
                        final byte b4 = 0;
                        p77Var.f(c6l.b, new Function0() { // from class: b6l
                            public final Object invoke() {
                                boolean zIsEmpty;
                                byte b5 = b4;
                                Set set2 = set;
                                switch (b5) {
                                    case 0:
                                        zIsEmpty = set2.isEmpty();
                                        break;
                                    default:
                                        zIsEmpty = set2.isEmpty();
                                        break;
                                }
                                return Boolean.valueOf(!zIsEmpty);
                            }
                        });
                        break;
                    case 1:
                        final Set set2 = (Set) obj;
                        final byte b5 = 1;
                        p77Var.f(c6l.d, new Function0() { // from class: b6l
                            public final Object invoke() {
                                boolean zIsEmpty;
                                byte b52 = b5;
                                Set set22 = set2;
                                switch (b52) {
                                    case 0:
                                        zIsEmpty = set22.isEmpty();
                                        break;
                                    default:
                                        zIsEmpty = set22.isEmpty();
                                        break;
                                }
                                return Boolean.valueOf(!zIsEmpty);
                            }
                        });
                        break;
                    default:
                        p77Var.f(c6l.a, new dnj((i) obj, (byte) 27));
                        break;
                }
            }
        });
        a26.T(pdeVar3, pdeVar, new f7f(this) { // from class: a6l
            public final /* synthetic */ p77 b;

            {
                this.b = this;
            }

            public final void d0(Object obj) {
                byte b3 = b;
                p77 p77Var = this.b;
                switch (b3) {
                    case 0:
                        final Set set = (Set) obj;
                        final byte b4 = 0;
                        p77Var.f(c6l.b, new Function0() { // from class: b6l
                            public final Object invoke() {
                                boolean zIsEmpty;
                                byte b52 = b4;
                                Set set22 = set;
                                switch (b52) {
                                    case 0:
                                        zIsEmpty = set22.isEmpty();
                                        break;
                                    default:
                                        zIsEmpty = set22.isEmpty();
                                        break;
                                }
                                return Boolean.valueOf(!zIsEmpty);
                            }
                        });
                        break;
                    case 1:
                        final Set set2 = (Set) obj;
                        final byte b5 = 1;
                        p77Var.f(c6l.d, new Function0() { // from class: b6l
                            public final Object invoke() {
                                boolean zIsEmpty;
                                byte b52 = b5;
                                Set set22 = set2;
                                switch (b52) {
                                    case 0:
                                        zIsEmpty = set22.isEmpty();
                                        break;
                                    default:
                                        zIsEmpty = set22.isEmpty();
                                        break;
                                }
                                return Boolean.valueOf(!zIsEmpty);
                            }
                        });
                        break;
                    default:
                        p77Var.f(c6l.a, new dnj((i) obj, (byte) 27));
                        break;
                }
            }
        });
        final byte b3 = 2;
        a26.T(pdeVar4, pdeVar, new f7f(this) { // from class: a6l
            public final /* synthetic */ p77 b;

            {
                this.b = this;
            }

            public final void d0(Object obj) {
                byte b32 = b3;
                p77 p77Var = this.b;
                switch (b32) {
                    case 0:
                        final Set set = (Set) obj;
                        final byte b4 = 0;
                        p77Var.f(c6l.b, new Function0() { // from class: b6l
                            public final Object invoke() {
                                boolean zIsEmpty;
                                byte b52 = b4;
                                Set set22 = set;
                                switch (b52) {
                                    case 0:
                                        zIsEmpty = set22.isEmpty();
                                        break;
                                    default:
                                        zIsEmpty = set22.isEmpty();
                                        break;
                                }
                                return Boolean.valueOf(!zIsEmpty);
                            }
                        });
                        break;
                    case 1:
                        final Set set2 = (Set) obj;
                        final byte b5 = 1;
                        p77Var.f(c6l.d, new Function0() { // from class: b6l
                            public final Object invoke() {
                                boolean zIsEmpty;
                                byte b52 = b5;
                                Set set22 = set2;
                                switch (b52) {
                                    case 0:
                                        zIsEmpty = set22.isEmpty();
                                        break;
                                    default:
                                        zIsEmpty = set22.isEmpty();
                                        break;
                                }
                                return Boolean.valueOf(!zIsEmpty);
                            }
                        });
                        break;
                    default:
                        p77Var.f(c6l.a, new dnj((i) obj, (byte) 27));
                        break;
                }
            }
        });
        pdeVar.k(new t7d(new vvf(recyclerView, new yc3(this, (byte) 8), (byte) 12), (byte) 7));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public p77(dx3 dx3Var) {
        this.a = (byte) 0;
        this.b = new i7f();
        this.c = dx3Var;
    }

    @Override // defpackage.w6f
    public final void F(Object obj) {
        byte b = this.a;
        i7f i7fVar = this.b;
        switch (b) {
            case 0:
                i7fVar.b((m9l) obj);
                break;
            default:
                i7fVar.b((o9l) obj);
                break;
        }
    }

    @Override // defpackage.w6f
    public final void H(Object obj) {
        byte b = this.a;
        i7f i7fVar = this.b;
        switch (b) {
            case 0:
                i7fVar.c((m9l) obj);
                break;
            default:
                i7fVar.c((o9l) obj);
                break;
        }
    }

    public final b87 a() {
        Pair pair = (Pair) this.d;
        if (pair == null) {
            return null;
        }
        b87 b87Var = (b87) pair.first;
        rim rimVar = (rim) pair.second;
        if (rimVar instanceof uim) {
            uim uimVar = (uim) rimVar;
            if (!uimVar.isRemoving() && uimVar.getFragmentManager() != null && !uimVar.getFragmentManager().L) {
                uimVar.dismiss();
            }
        } else if (rimVar instanceof mx3) {
            ((mx3) rimVar).a.dismiss();
        } else if (rimVar instanceof tf5) {
            tf5 tf5Var = (tf5) rimVar;
            d4 d4Var = tf5Var.d;
            if (d4Var != null) {
                ViewParent parent = d4Var.getParent();
                ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
                if (viewGroup != null) {
                    viewGroup.removeView(d4Var);
                }
                d4Var.e();
            }
            tf5Var.d = null;
        }
        this.d = null;
        return b87Var;
    }

    public final void b(b87 b87Var) {
        g7f g7fVar = new g7f(this.b);
        while (g7fVar.hasNext()) {
            m9l m9lVar = (m9l) g7fVar.next();
            m9lVar.a.add(b87Var);
            m9lVar.a();
        }
    }

    public final void c(b87 b87Var) {
        b87 b87VarA;
        Pair pair = (Pair) this.d;
        if (pair == null || pair.first != b87Var || (b87VarA = a()) == null) {
            return;
        }
        g7f g7fVar = new g7f(this.b);
        while (g7fVar.hasNext()) {
            m9l m9lVar = (m9l) g7fVar.next();
            if (m9lVar.a.remove(b87VarA)) {
                m9lVar.a();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [android.view.View, ch5, d4, java.lang.Object] */
    public final void e(rim rimVar, b87 b87Var) {
        this.d = new Pair(b87Var, rimVar);
        if (rimVar instanceof uim) {
            w supportFragmentManager = ((dx3) this.c).getSupportFragmentManager();
            supportFragmentManager.getClass();
            a aVar = new a(supportFragmentManager);
            aVar.c((String) null);
            ((uim) rimVar).show(aVar, "ui-dialog-fragment");
            supportFragmentManager.D();
            b(b87Var);
            return;
        }
        if (rimVar instanceof mx3) {
            mx3 mx3Var = (mx3) rimVar;
            Dialog dialog = mx3Var.a;
            u8n.e(dialog);
            o0g.N0(dialog);
            dialog.show();
            mx3Var.a();
            Context context = dialog.getContext();
            String[] strArr = OperaApplication.K;
            ((OperaApplication) context.getApplicationContext()).B().a(dialog);
            ab abVar = mx3Var.b;
            if (abVar != null) {
                abVar.run(dialog);
            }
            b(b87Var);
            return;
        }
        if (rimVar instanceof tf5) {
            tf5 tf5Var = (tf5) rimVar;
            Activity activity = tf5Var.a;
            ?? ch5Var = new ch5(activity);
            ch5Var.setTag(2131365017, (ndc) activity);
            ch5Var.setTag(2131365021, (w7n) activity);
            ch5Var.setTag(2131365020, (rki) activity);
            Function0 function0 = ((d4) ch5Var).e;
            if (function0 != null) {
                function0.invoke();
            }
            s5n s5nVar = new s5n((d4) ch5Var, (byte) 0);
            ch5Var.addOnAttachStateChangeListener(s5nVar);
            ((d4) ch5Var).e = new eek((Object) ch5Var, (Object) s5nVar, (byte) 21);
            ch5Var.o(new ue5(53029770, new sf5(tf5Var, (byte) 0), true));
            tf5Var.d = ch5Var;
            activity.addContentView(ch5Var, new ViewGroup.LayoutParams(-1, -1));
            tf5Var.b.invoke();
            b(b87Var);
        }
    }

    public final void f(c6l c6lVar, Function0 function0) {
        LinkedHashSet linkedHashSet = (LinkedHashSet) this.d;
        if (((Boolean) function0.invoke()).booleanValue() ? linkedHashSet.add(c6lVar) : linkedHashSet.remove(c6lVar)) {
            i7f i7fVar = this.b;
            g7f g7fVarC = u35.c(i7fVar, i7fVar);
            while (g7fVarC.hasNext()) {
                o9l o9lVar = (o9l) g7fVarC.next();
                o9lVar.getClass();
                boolean zIsEmpty = linkedHashSet.isEmpty();
                if ((!zIsEmpty) != o9lVar.a) {
                    r9l r9lVar = o9lVar.b;
                    g4l g4lVar = r9lVar.D;
                    if (zIsEmpty) {
                        r9lVar.q(new d4l(g4lVar, (byte) 8));
                        o9lVar.a = false;
                    } else {
                        uz3 uz3Var = linkedHashSet.contains(c6l.a) ? uz3.e : null;
                        g4lVar.j.add(f4l.c);
                        g4lVar.d(new eek((Object) g4lVar, (Object) uz3Var, (byte) 7));
                        o9lVar.a = true;
                    }
                }
            }
        }
    }
}
