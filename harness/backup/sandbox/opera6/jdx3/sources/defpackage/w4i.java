package defpackage;

import androidx.fragment.app.Fragment;
import com.leanplum.utils.SizeUtil;
import com.opera.android.settings.speed_dial.SpeedDialShapePreview;
import java.util.List;
import java.util.concurrent.ExecutorService;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final /* synthetic */ class w4i implements f7f, kr9 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ w4i(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public final br9 a() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                return (rmg) obj;
            case 1:
                return (vvf) obj;
            case 2:
                return (tji) obj;
            case 3:
                return (pli) obj;
            case 4:
                return (tmi) obj;
            case 5:
                return (tji) obj;
            case 6:
                return (tji) obj;
            case 7:
                return new nr9(1, (c9j) obj, c9j.class, "onUpdateState", "onUpdateState(Lcom/opera/android/settings/settings_search/SettingsSearchState;)V", 0);
            case 8:
                return (tji) obj;
            case h1a.ERROR_PRIVATE_FIELD_NUMBER /* 9 */:
                return new nr9(1, (szj) obj, szj.class, "updateState", "updateState(Lcom/opera/android/settings/speed_dial/SpeedDialSettingsState;)V", 0);
            case h1a.INTENTS_REGULAR_FIELD_NUMBER /* 10 */:
                return new nr9(1, (v7k) obj, v7k.class, "updateState", "updateState(Lcom/opera/android/settings/start_page/StartPageSettingsState;)V", 0);
            case 11:
                return (n6k) obj;
            case 12:
                return (n6k) obj;
            case 13:
                return (n6k) obj;
            case 14:
                return (n6k) obj;
            case 15:
                return (n6k) obj;
            case 16:
                return (n6k) obj;
            case 17:
                return (n6k) obj;
            case SizeUtil.textSize0_1 /* 18 */:
                return (n6k) obj;
            case 19:
                return (n6k) obj;
            case SizeUtil.textSize0 /* 20 */:
                return new nr9(1, (dyk) obj, dyk.class, "updateUser", "updateUser(Lcom/opera/android/account/OperaUser$Container;)V", 0);
            case 21:
                return new nr9(1, (g4l) obj, g4l.class, "onIncognitoFadeFractChanged", "onIncognitoFadeFractChanged(F)V", 0);
            case SizeUtil.textSize1 /* 22 */:
                return (e5l) obj;
            case 23:
                return (n6k) obj;
            case SizeUtil.textSize2 /* 24 */:
                return (f9l) obj;
            case 25:
                return (n6k) obj;
            case 26:
                return (n6k) obj;
            case 27:
                return (qfl) obj;
            case 28:
                return (cvl) obj;
            default:
                return (qfl) obj;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v23, types: [android.view.View, com.opera.android.ui.catalog.widget.OperaListItem] */
    /* JADX WARN: Type inference failed for: r14v15, types: [android.view.View, com.opera.android.ui.catalog.widget.OperaListItem] */
    public final void d0(Object obj) {
        byte b = this.a;
        boolean z = false;
        byte b2 = 1;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                ((rmg) obj2).invoke(obj);
                break;
            case 1:
                ((vvf) obj2).invoke(obj);
                break;
            case 2:
                ((tji) obj2).invoke(obj);
                break;
            case 3:
                ((pli) obj2).invoke(obj);
                break;
            case 4:
                ((tmi) obj2).invoke(obj);
                break;
            case 5:
                ((tji) obj2).invoke(obj);
                break;
            case 6:
                ((tji) obj2).invoke(obj);
                break;
            case 7:
                final j9j j9jVar = (j9j) obj;
                c9j c9jVar = (c9j) obj2;
                xtb[] xtbVarArr = c9j.w;
                boolean z2 = j9jVar.c;
                boolean z3 = j9jVar.c;
                List list = j9jVar.b;
                if (z2 && list.isEmpty()) {
                    c9jVar.J0(false);
                }
                y8j y8jVar = (y8j) c9jVar.s.getValue();
                final u8j u8jVar = new u8j(c9jVar, (byte) 2);
                final jk7 jk7Var = y8jVar.a;
                y8j y8jVar2 = (y8j) jk7Var.e;
                c9j c9jVar2 = y8jVar2.b;
                final long j = jk7Var.b + 1;
                jk7Var.b = j;
                if ((z3 && list.isEmpty()) == true) {
                    int size = ((List) jk7Var.c).size() + (jk7Var.a ? 1 : 0);
                    jk7Var.c = l08.a;
                    jk7Var.a = false;
                    y8jVar2.notifyItemRangeRemoved(0, size);
                    break;
                } else if (jk7Var.a != z3 || !Intrinsics.a((List) jk7Var.c, list)) {
                    boolean z4 = jk7Var.a;
                    boolean z5 = j9jVar.c;
                    boolean zIsEmpty = list.isEmpty();
                    List list2 = (List) jk7Var.c;
                    if (zIsEmpty) {
                        int size2 = list2.size() + (z4 ? 1 : 0);
                        jk7Var.a = z3;
                        jk7Var.c = list;
                        c9jVar2.J0(true);
                        y8jVar2.notifyItemRangeRemoved(z5 ? 1 : 0, size2);
                        break;
                    } else if (list2.isEmpty()) {
                        int size3 = list.size() + (z5 ? 1 : 0);
                        jk7Var.a = z3;
                        jk7Var.c = list;
                        c9jVar2.J0(true);
                        y8jVar2.notifyItemRangeInserted(0, size3);
                        break;
                    } else {
                        final List list3 = (List) jk7Var.c;
                        ExecutorService executorService = (ExecutorService) ((c37) jk7Var.d).a;
                        final y8j y8jVar3 = (y8j) jk7Var.e;
                        final c9j c9jVar3 = y8jVar3.b;
                        final int i = z4 ? 1 : 0;
                        final int i2 = z5 ? 1 : 0;
                        executorService.execute(new Runnable() { // from class: v8j
                            @Override // java.lang.Runnable
                            public final void run() {
                                List list4 = list3;
                                int i3 = i;
                                final j9j j9jVar2 = j9jVar;
                                boolean z6 = i2;
                                final jk7 jk7Var2 = jk7Var;
                                final j87 j87VarK = uup.k(new x8j(list4, i3, j9jVar2, z6 ? 1 : 0, jk7Var2), true);
                                final long j2 = j;
                                final c9j c9jVar4 = c9jVar3;
                                final y8j y8jVar4 = y8jVar3;
                                final u8j u8jVar2 = u8jVar;
                                vml.c(new Runnable() { // from class: w8j
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        jk7 jk7Var3 = jk7Var2;
                                        if (j2 == jk7Var3.b) {
                                            j9j j9jVar3 = j9jVar2;
                                            jk7Var3.c = j9jVar3.b;
                                            jk7Var3.a = j9jVar3.c;
                                            xtb[] xtbVarArr2 = c9j.w;
                                            c9jVar4.J0(true);
                                            j87VarK.b(y8jVar4);
                                            u8jVar2.invoke();
                                        }
                                    }
                                });
                            }
                        });
                        break;
                    }
                } else {
                    c9jVar2.J0(true);
                    break;
                }
                break;
            case 8:
                ((tji) obj2).invoke(obj);
                break;
            case h1a.ERROR_PRIVATE_FIELD_NUMBER /* 9 */:
                uzj uzjVar = (uzj) obj;
                szj szjVar = (szj) obj2;
                xtb[] xtbVarArr2 = szj.w;
                szjVar.H0().b.t(uzjVar.a);
                szjVar.H0().f.setVisibility(uzjVar.a ? 0 : 8);
                p7j p7jVar = uzjVar.b;
                for (SpeedDialShapePreview speedDialShapePreview : (List) szjVar.v.getValue()) {
                    speedDialShapePreview.setSelected(speedDialShapePreview.p == p7jVar);
                }
                szjVar.H0().c.t(uzjVar.c);
                szjVar.H0().d.t(uzjVar.d);
                break;
            case h1a.INTENTS_REGULAR_FIELD_NUMBER /* 10 */:
                z7k z7kVar = (z7k) obj;
                Fragment fragment = (v7k) obj2;
                knn knnVar = z7kVar.a;
                rsi rsiVar = z7kVar.f;
                rsi rsiVar2 = z7kVar.e;
                List list4 = knnVar.a;
                if (!Intrinsics.a(fragment.x, list4)) {
                    fragment.x = list4;
                    vkn vknVar = (vkn) fragment.y.a(fragment, v7k.A[1]);
                    vknVar.a.T(list4);
                    vknVar.b.x0(0);
                }
                v7k.J0(fragment.H0().g, z7kVar.b);
                v7k.J0(fragment.H0().m, z7kVar.c);
                v7k.J0(fragment.H0().j, z7kVar.k);
                v7k.J0(fragment.H0().k, z7kVar.l);
                v7k.J0(fragment.H0().d, z7kVar.g);
                v7k.J0(fragment.H0().e, z7kVar.h);
                v7k.J0(fragment.H0().b, z7kVar.i);
                v7k.J0(fragment.H0().f, z7kVar.j);
                v7k.J0(fragment.H0().c, z7kVar.d);
                ?? r14 = fragment.H0().h;
                r14.setVisibility(rsiVar2.a ? 0 : 8);
                r14.t(rsiVar2.b);
                r14.C(rsiVar2.c);
                r14.z(rsiVar2.d);
                ?? r13 = fragment.H0().i;
                r13.setVisibility(rsiVar.a ? 0 : 8);
                r13.t(rsiVar.b);
                r13.C(rsiVar.c);
                r13.z(rsiVar.d);
                break;
            case 11:
                ((n6k) obj2).invoke(obj);
                break;
            case 12:
                ((n6k) obj2).invoke(obj);
                break;
            case 13:
                ((n6k) obj2).invoke(obj);
                break;
            case 14:
                ((n6k) obj2).invoke(obj);
                break;
            case 15:
                ((n6k) obj2).invoke(obj);
                break;
            case 16:
                ((n6k) obj2).invoke(obj);
                break;
            case 17:
                ((n6k) obj2).invoke(obj);
                break;
            case SizeUtil.textSize0_1 /* 18 */:
                ((n6k) obj2).invoke(obj);
                break;
            case 19:
                ((n6k) obj2).invoke(obj);
                break;
            case SizeUtil.textSize0 /* 20 */:
                ((dpf) obj).a(new rii(obj2, (byte) 10));
                break;
            case 21:
                float fFloatValue = ((Number) obj).floatValue();
                g4l g4lVar = (g4l) obj2;
                float f = g4lVar.n;
                if (fFloatValue != f) {
                    Object[] objArr = f == 0.0f && fFloatValue > 0.0f;
                    if (f > 0.0f && fFloatValue == 0.0f) {
                        z = true;
                    }
                    if (objArr == true) {
                        g4lVar.d(new d4l(g4lVar, (byte) 7));
                    } else if (z) {
                        g4lVar.d(new d4l(g4lVar, b2));
                    }
                    g4lVar.n = fFloatValue;
                    break;
                }
                break;
            case SizeUtil.textSize1 /* 22 */:
                ((e5l) obj2).invoke(obj);
                break;
            case 23:
                ((n6k) obj2).invoke(obj);
                break;
            case SizeUtil.textSize2 /* 24 */:
                ((f9l) obj2).invoke(obj);
                break;
            case 25:
                ((n6k) obj2).invoke(obj);
                break;
            case 26:
                ((n6k) obj2).invoke(obj);
                break;
            case 27:
                ((qfl) obj2).invoke(obj);
                break;
            case 28:
                ((cvl) obj2).invoke(obj);
                break;
            default:
                ((qfl) obj2).invoke(obj);
                break;
        }
    }

    public final boolean equals(Object obj) {
        switch (this.a) {
            case 0:
                if ((obj instanceof f7f) && (obj instanceof kr9)) {
                    break;
                }
                break;
            case 1:
                if ((obj instanceof f7f) && (obj instanceof kr9)) {
                    break;
                }
                break;
            case 2:
                if ((obj instanceof f7f) && (obj instanceof kr9)) {
                    break;
                }
                break;
            case 3:
                if ((obj instanceof f7f) && (obj instanceof kr9)) {
                    break;
                }
                break;
            case 4:
                if ((obj instanceof f7f) && (obj instanceof kr9)) {
                    break;
                }
                break;
            case 5:
                if ((obj instanceof f7f) && (obj instanceof kr9)) {
                    break;
                }
                break;
            case 6:
                if ((obj instanceof f7f) && (obj instanceof kr9)) {
                    break;
                }
                break;
            case 7:
                if ((obj instanceof f7f) && (obj instanceof kr9)) {
                    break;
                }
                break;
            case 8:
                if ((obj instanceof f7f) && (obj instanceof kr9)) {
                    break;
                }
                break;
            case h1a.ERROR_PRIVATE_FIELD_NUMBER /* 9 */:
                if ((obj instanceof f7f) && (obj instanceof kr9)) {
                    break;
                }
                break;
            case h1a.INTENTS_REGULAR_FIELD_NUMBER /* 10 */:
                if ((obj instanceof f7f) && (obj instanceof kr9)) {
                    break;
                }
                break;
            case 11:
                if ((obj instanceof f7f) && (obj instanceof kr9)) {
                    break;
                }
                break;
            case 12:
                if ((obj instanceof f7f) && (obj instanceof kr9)) {
                    break;
                }
                break;
            case 13:
                if ((obj instanceof f7f) && (obj instanceof kr9)) {
                    break;
                }
                break;
            case 14:
                if ((obj instanceof f7f) && (obj instanceof kr9)) {
                    break;
                }
                break;
            case 15:
                if ((obj instanceof f7f) && (obj instanceof kr9)) {
                    break;
                }
                break;
            case 16:
                if ((obj instanceof f7f) && (obj instanceof kr9)) {
                    break;
                }
                break;
            case 17:
                if ((obj instanceof f7f) && (obj instanceof kr9)) {
                    break;
                }
                break;
            case SizeUtil.textSize0_1 /* 18 */:
                if ((obj instanceof f7f) && (obj instanceof kr9)) {
                    break;
                }
                break;
            case 19:
                if ((obj instanceof f7f) && (obj instanceof kr9)) {
                    break;
                }
                break;
            case SizeUtil.textSize0 /* 20 */:
                if ((obj instanceof f7f) && (obj instanceof kr9)) {
                    break;
                }
                break;
            case 21:
                if ((obj instanceof f7f) && (obj instanceof kr9)) {
                    break;
                }
                break;
            case SizeUtil.textSize1 /* 22 */:
                if ((obj instanceof f7f) && (obj instanceof kr9)) {
                    break;
                }
                break;
            case 23:
                if ((obj instanceof f7f) && (obj instanceof kr9)) {
                    break;
                }
                break;
            case SizeUtil.textSize2 /* 24 */:
                if ((obj instanceof f7f) && (obj instanceof kr9)) {
                    break;
                }
                break;
            case 25:
                if ((obj instanceof f7f) && (obj instanceof kr9)) {
                    break;
                }
                break;
            case 26:
                if ((obj instanceof f7f) && (obj instanceof kr9)) {
                    break;
                }
                break;
            case 27:
                if ((obj instanceof f7f) && (obj instanceof kr9)) {
                    break;
                }
                break;
            case 28:
                if ((obj instanceof f7f) && (obj instanceof kr9)) {
                    break;
                }
                break;
            default:
                if ((obj instanceof f7f) && (obj instanceof kr9)) {
                    break;
                }
                break;
        }
        return Intrinsics.a(a(), ((kr9) obj).a());
    }

    public final int hashCode() {
        switch (this.a) {
        }
        return a().hashCode();
    }
}
