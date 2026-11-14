package androidx.fragment.app;

import android.view.View;
import android.view.ViewGroup;
import androidx.collection.ArrayMap;
import defpackage.hyj;
import defpackage.o95;
import defpackage.r16;
import defpackage.r5n;
import defpackage.vv6;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Objects;
import java.util.WeakHashMap;
import kotlin.collections.CollectionsKt;

/* loaded from: classes.dex */
public final class h {
    public final ViewGroup a;
    public final ArrayList b = new ArrayList();
    public final ArrayList c = new ArrayList();
    public boolean d;
    public boolean e;
    public boolean f;

    public h(ViewGroup viewGroup) {
        this.a = viewGroup;
    }

    public static void f(ArrayMap arrayMap, View view) {
        WeakHashMap weakHashMap = r5n.a;
        String transitionName = view.getTransitionName();
        if (transitionName != null) {
            arrayMap.put(transitionName, view);
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                if (childAt.getVisibility() == 0) {
                    f(arrayMap, childAt);
                }
            }
        }
    }

    public static final h j(ViewGroup viewGroup, w wVar) {
        r16 r16VarM = wVar.M();
        Object tag = viewGroup.getTag(2131364518);
        if (tag instanceof h) {
            return (h) tag;
        }
        r16VarM.getClass();
        h hVar = new h(viewGroup);
        viewGroup.setTag(2131364518, hVar);
        return hVar;
    }

    public static boolean k(ArrayList arrayList) {
        boolean z;
        int size = arrayList.size();
        int i = 0;
        loop0: while (true) {
            z = true;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                c0 c0Var = (c0) obj;
                if (!c0Var.k.isEmpty()) {
                    ArrayList arrayList2 = c0Var.k;
                    if (!arrayList2.isEmpty()) {
                        int size2 = arrayList2.size();
                        int i2 = 0;
                        while (i2 < size2) {
                            Object obj2 = arrayList2.get(i2);
                            i2++;
                            if (!((hyj) obj2).a()) {
                                break;
                            }
                        }
                    }
                }
                z = false;
            }
            break loop0;
        }
        if (z) {
            ArrayList arrayList3 = new ArrayList();
            int size3 = arrayList.size();
            int i3 = 0;
            while (i3 < size3) {
                Object obj3 = arrayList.get(i3);
                i3++;
                o95.t(((c0) obj3).k, arrayList3);
            }
            if (!arrayList3.isEmpty()) {
                return true;
            }
        }
        return false;
    }

    public final void a(c0 c0Var) {
        if (c0Var.i) {
            fki.a(c0Var.a, c0Var.c.requireView(), this.a);
            c0Var.i = false;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x0255, code lost:
    
        if (androidx.fragment.app.w.N(2) == false) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x0257, code lost:
    
        r3 = r2.size();
        r4 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x025c, code lost:
    
        if (r4 >= r3) goto L243;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x025e, code lost:
    
        r6 = r2.get(r4);
        r4 = r4 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x0267, code lost:
    
        r3 = r9.size();
        r4 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x026c, code lost:
    
        if (r4 >= r3) goto L244;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x026e, code lost:
    
        r6 = r9.get(r4);
        r4 = r4 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x0277, code lost:
    
        f(r12, r1.mView);
        r12.n(r9);
        r10.n(r12.keySet());
        f(r13, r11.mView);
        r13.n(r2);
        r13.n(r10.values());
        r1 = defpackage.an9.a;
        r1 = r10.c - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x029c, code lost:
    
        if ((-1) >= r1) goto L245;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x02a8, code lost:
    
        if (r13.containsKey((java.lang.String) r10.k(r1)) != false) goto L247;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x02aa, code lost:
    
        r10.h(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x02ad, code lost:
    
        r1 = r1 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x02b0, code lost:
    
        r6 = 10;
        defpackage.o95.u(r12.entrySet(), new defpackage.b11(r10.keySet(), r6), false);
        defpackage.o95.u(r13.entrySet(), new defpackage.b11(r10.values(), r6), false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x02d7, code lost:
    
        if (r10.isEmpty() == false) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x02d9, code lost:
    
        java.util.Objects.toString(r18);
        r21.toString();
        r22.toString();
        r24.clear();
        r8.clear();
        r11 = r2;
        r17 = r9;
        r1 = r19;
        r2 = r20;
        r3 = r21;
        r4 = r22;
        r6 = r23;
        r7 = r24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x02f9, code lost:
    
        r11 = r2;
        r17 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x02fc, code lost:
    
        r1 = r19;
        r2 = r20;
        r3 = r21;
        r4 = r22;
        r6 = r23;
        r7 = r24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x030a, code lost:
    
        h9o.t();
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x030d, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x030e, code lost:
    
        r20 = r2;
        r21 = r3;
        r22 = r4;
        r23 = r6;
        r24 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x0319, code lost:
    
        r19 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x031c, code lost:
    
        r20 = r2;
        r21 = r3;
        r22 = r4;
        r23 = r6;
        r24 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x0326, code lost:
    
        if (r18 != null) goto L132;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x032c, code lost:
    
        if (r5.isEmpty() != false) goto L131;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x032e, code lost:
    
        r1 = r5.size();
        r2 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x0333, code lost:
    
        if (r2 >= r1) goto L249;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x0335, code lost:
    
        r3 = r5.get(r2);
        r2 = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x033f, code lost:
    
        if (((defpackage.ew6) r3).b != null) goto L248;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x0342, code lost:
    
        r17 = 2;
        r15 = r20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x0347, code lost:
    
        r10 = r11;
        r11 = r17;
        r15 = r20;
        r17 = 2;
        r1 = new androidx.fragment.app.g(r5, r21, r22, r23, r18, r24, r8, r10, r10, r11, r12, r13, r27);
        r3 = r5.size();
        r4 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x0364, code lost:
    
        if (r4 >= r3) goto L251;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x0366, code lost:
    
        r5 = r5.get(r4);
        r4 = r4 + 1;
        ((defpackage.ew6) r5).a.j.add(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x0376, code lost:
    
        r1 = new java.util.ArrayList();
        r2 = new java.util.ArrayList();
        r3 = r15.size();
        r4 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x0385, code lost:
    
        if (r4 >= r3) goto L206;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x0387, code lost:
    
        r5 = r15.get(r4);
        r4 = r4 + 1;
        defpackage.o95.t(((androidx.fragment.app.d) r5).a.k, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x0397, code lost:
    
        r2 = r2.isEmpty();
        r3 = r15.size();
        r4 = false;
        r5 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x03a1, code lost:
    
        if (r5 >= r3) goto L207;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x03a3, code lost:
    
        r6 = r15.get(r5);
        r5 = r5 + 1;
        r6 = (androidx.fragment.app.d) r6;
        r7 = r25.a.getContext();
        r8 = r6.a;
        r7 = r6.b(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x03b7, code lost:
    
        if (r7 == null) goto L215;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x03bd, code lost:
    
        if (((android.animation.AnimatorSet) r7.c) != null) goto L209;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x03bf, code lost:
    
        r1.add(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x03c3, code lost:
    
        r7 = r8.c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x03cb, code lost:
    
        if (r8.k.isEmpty() != false) goto L210;
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x03d1, code lost:
    
        if (androidx.fragment.app.w.N(r17) == false) goto L217;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x03d3, code lost:
    
        java.util.Objects.toString(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x03da, code lost:
    
        if (r8.a != 3) goto L153;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x03dc, code lost:
    
        r8.i = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x03df, code lost:
    
        r8.j.add(new androidx.fragment.app.e(r6));
        r4 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x03ec, code lost:
    
        r0 = r1.size();
        r15 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x03f2, code lost:
    
        if (r15 >= r0) goto L220;
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x03f4, code lost:
    
        r3 = r1.get(r15);
        r15 = r15 + 1;
        r3 = (androidx.fragment.app.d) r3;
        r5 = r3.a;
        r6 = r5.c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x0400, code lost:
    
        if (r2 != false) goto L221;
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x0406, code lost:
    
        if (androidx.fragment.app.w.N(r17) == false) goto L231;
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x0408, code lost:
    
        java.util.Objects.toString(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x040c, code lost:
    
        if (r4 == false) goto L223;
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x0412, code lost:
    
        if (androidx.fragment.app.w.N(r17) == false) goto L229;
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x0414, code lost:
    
        java.util.Objects.toString(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x0418, code lost:
    
        r5.j.add(new androidx.fragment.app.c(r3));
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x0423, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x008a, code lost:
    
        r4 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0091, code lost:
    
        if (androidx.fragment.app.w.N(2) == false) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0093, code lost:
    
        java.util.Objects.toString(r3);
        java.util.Objects.toString(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0099, code lost:
    
        r2 = new java.util.ArrayList();
        r5 = new java.util.ArrayList();
        r6 = ((androidx.fragment.app.c0) kotlin.collections.CollectionsKt.Q(r26)).c;
        r7 = r26.size();
        r10 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00b0, code lost:
    
        if (r10 >= r7) goto L188;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00b2, code lost:
    
        r11 = r26.get(r10);
        r10 = r10 + 1;
        r11 = ((androidx.fragment.app.c0) r11).c.mAnimationInfo;
        r12 = r6.mAnimationInfo;
        r11.b = r12.b;
        r11.c = r12.c;
        r11.d = r12.d;
        r11.e = r12.e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00d1, code lost:
    
        r6 = r26.size();
        r7 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00d8, code lost:
    
        if (r7 >= r6) goto L189;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00da, code lost:
    
        r10 = r26.get(r7);
        r7 = r7 + 1;
        r10 = (androidx.fragment.app.c0) r10;
        r2.add(new androidx.fragment.app.d(r10, r27));
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00ec, code lost:
    
        if (r27 == false) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00ee, code lost:
    
        if (r10 != r3) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00f1, code lost:
    
        if (r10 != r4) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00f3, code lost:
    
        r12 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00f6, code lost:
    
        r12 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00f7, code lost:
    
        r5.add(new defpackage.ew6(r10, r27, r12));
        r10.d.add(new defpackage.vv6(r25, r10, (byte) 0));
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0108, code lost:
    
        r1 = new java.util.ArrayList();
        r6 = r5.size();
        r7 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0112, code lost:
    
        if (r7 >= r6) goto L192;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0114, code lost:
    
        r10 = r5.get(r7);
        r7 = r7 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0121, code lost:
    
        if (((defpackage.ew6) r10).a() != false) goto L195;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0123, code lost:
    
        r1.add(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0127, code lost:
    
        r5 = new java.util.ArrayList();
        r6 = r1.size();
        r7 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0131, code lost:
    
        if (r7 >= r6) goto L197;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0133, code lost:
    
        r10 = r1.get(r7);
        r7 = r7 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0140, code lost:
    
        if (((defpackage.ew6) r10).b() == null) goto L200;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0142, code lost:
    
        r5.add(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0146, code lost:
    
        r1 = r5.size();
        r7 = 0;
        r6 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x014c, code lost:
    
        if (r7 >= r1) goto L202;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x014e, code lost:
    
        r10 = r5.get(r7);
        r7 = r7 + 1;
        r10 = (defpackage.ew6) r10;
        r11 = r10.b();
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x015a, code lost:
    
        if (r6 == null) goto L204;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x015c, code lost:
    
        if (r11 == r6) goto L205;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x015e, code lost:
    
        r0 = new java.lang.StringBuilder("Mixing framework transitions and AndroidX transitions is not allowed. Fragment ");
        r0.append(r10.a.c);
        r0.append(" returned Transition ");
        bxl.d(am2.o(r0, r10.b, " which uses a different Transition type than other Fragments."));
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x017c, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x017d, code lost:
    
        r6 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x017f, code lost:
    
        if (r6 != null) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0181, code lost:
    
        r15 = r2;
        r17 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0186, code lost:
    
        r7 = new java.util.ArrayList();
        r8 = new java.util.ArrayList();
        r10 = new androidx.collection.ArrayMap(0);
        r11 = new java.util.ArrayList<>();
        r12 = new java.util.ArrayList<>();
        r12 = new androidx.collection.ArrayMap(0);
        r17 = r12;
        r13 = new androidx.collection.ArrayMap(0);
        r1 = r5.size();
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x01b3, code lost:
    
        r18 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x01b5, code lost:
    
        if (r15 >= r1) goto L233;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x01b7, code lost:
    
        r19 = r5.get(r15);
        r15 = r15 + 1;
        r9 = ((defpackage.ew6) r19).d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x01c3, code lost:
    
        if (r9 == null) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x01c5, code lost:
    
        if (r3 == null) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x01c7, code lost:
    
        r19 = r1;
        r1 = r3.c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x01cb, code lost:
    
        if (r4 == null) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x01cd, code lost:
    
        r11 = r4.c;
        r18 = r6.y(r6.h(r9));
        r9 = r11.getSharedElementSourceNames();
        r20 = r2;
        r2 = r1.getSharedElementSourceNames();
        r21 = r3;
        r3 = r1.getSharedElementTargetNames();
        r22 = r4;
        r4 = r3.size();
        r23 = r6;
        r24 = r7;
        r6 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x01f3, code lost:
    
        if (r6 >= r4) goto L239;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x01f5, code lost:
    
        r17 = r4;
        r4 = r9.indexOf(r3.get(r6));
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x01ff, code lost:
    
        if (r4 == (-1)) goto L241;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0201, code lost:
    
        r9.set(r4, r2.get(r6));
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0208, code lost:
    
        r6 = r6 + 1;
        r4 = r17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x020d, code lost:
    
        r2 = r11.getSharedElementTargetNames();
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0211, code lost:
    
        if (r27 != false) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0213, code lost:
    
        r1.getExitTransitionCallback();
        r11.getEnterTransitionCallback();
        r3 = new kotlin.Pair((java.lang.Object) null, (java.lang.Object) null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0220, code lost:
    
        r1.getEnterTransitionCallback();
        r11.getExitTransitionCallback();
        r3 = new kotlin.Pair((java.lang.Object) null, (java.lang.Object) null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x022e, code lost:
    
        if (r3.a != null) goto L234;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0232, code lost:
    
        if (r3.b != null) goto L235;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0234, code lost:
    
        r3 = r9.size();
        r6 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0239, code lost:
    
        if (r6 >= r3) goto L242;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x023b, code lost:
    
        r10.put(r9.get(r6), r2.get(r6));
        r6 = r6 + 1;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v17, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r10v4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(java.util.ArrayList r26, boolean r27) throws android.content.res.Resources.NotFoundException {
        /*
            Method dump skipped, instructions count: 1060
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.h.b(java.util.ArrayList, boolean):void");
    }

    public final void c(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            o95.t(((c0) obj).k, arrayList2);
        }
        List listK0 = CollectionsKt.k0(CollectionsKt.n0(arrayList2));
        int size2 = listK0.size();
        for (int i2 = 0; i2 < size2; i2++) {
            ((hyj) listK0.get(i2)).c(this.a);
        }
        int size3 = arrayList.size();
        for (int i3 = 0; i3 < size3; i3++) {
            a((c0) arrayList.get(i3));
        }
        List listK02 = CollectionsKt.k0(arrayList);
        int size4 = listK02.size();
        for (int i4 = 0; i4 < size4; i4++) {
            c0 c0Var = (c0) listK02.get(i4);
            if (c0Var.k.isEmpty()) {
                c0Var.b();
            }
        }
    }

    public final void d(int i, int i2, z zVar) {
        synchronized (this.b) {
            c0 c0VarG = g(zVar.c);
            if (c0VarG == null) {
                Fragment fragment = zVar.c;
                c0VarG = (fragment.mTransitioning || fragment.mRemoving) ? h(fragment) : null;
            }
            if (c0VarG != null) {
                c0VarG.d(i, i2);
                return;
            }
            final c0 c0Var = new c0(i, i2, zVar);
            this.b.add(c0Var);
            c0Var.d.add(new Runnable() { // from class: androidx.fragment.app.b0
                @Override // java.lang.Runnable
                public final void run() {
                    h hVar = this.a;
                    ArrayList arrayList = hVar.b;
                    c0 c0Var2 = c0Var;
                    if (arrayList.contains(c0Var2)) {
                        fki.a(c0Var2.a, c0Var2.c.mView, hVar.a);
                    }
                }
            });
            c0Var.d.add(new vv6(this, c0Var, (byte) 1));
        }
    }

    public final void e() {
        if (this.f) {
            return;
        }
        if (!this.a.isAttachedToWindow()) {
            i();
            this.e = false;
            return;
        }
        synchronized (this.b) {
            ArrayList arrayList = new ArrayList(this.c);
            this.c.clear();
            int size = arrayList.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    break;
                }
                Object obj = arrayList.get(i);
                i++;
                c0 c0Var = (c0) obj;
                if (this.b.isEmpty() || !c0Var.c.mTransitioning) {
                    z = false;
                }
                c0Var.g = z;
            }
            int size2 = arrayList.size();
            int i2 = 0;
            while (i2 < size2) {
                Object obj2 = arrayList.get(i2);
                i2++;
                c0 c0Var2 = (c0) obj2;
                if (this.d) {
                    if (w.N(2)) {
                        Objects.toString(c0Var2);
                    }
                    c0Var2.b();
                } else {
                    if (w.N(2)) {
                        Objects.toString(c0Var2);
                    }
                    c0Var2.a(this.a);
                }
                this.d = false;
                if (!c0Var2.f) {
                    this.c.add(c0Var2);
                }
            }
            if (!this.b.isEmpty()) {
                n();
                ArrayList arrayList2 = new ArrayList(this.b);
                if (arrayList2.isEmpty()) {
                    return;
                }
                this.b.clear();
                this.c.addAll(arrayList2);
                b(arrayList2, this.e);
                boolean zK = k(arrayList2);
                int size3 = arrayList2.size();
                int i3 = 0;
                boolean z = true;
                while (i3 < size3) {
                    Object obj3 = arrayList2.get(i3);
                    i3++;
                    if (!((c0) obj3).c.mTransitioning) {
                        z = false;
                    }
                }
                this.d = z && !zK;
                if (!z) {
                    m(arrayList2);
                    c(arrayList2);
                } else if (zK) {
                    m(arrayList2);
                    int size4 = arrayList2.size();
                    for (int i4 = 0; i4 < size4; i4++) {
                        a((c0) arrayList2.get(i4));
                    }
                }
                this.e = false;
            }
        }
    }

    public final c0 g(Fragment fragment) {
        Object obj;
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                obj = null;
                break;
            }
            obj = arrayList.get(i);
            i++;
            c0 c0Var = (c0) obj;
            if (c0Var.c.equals(fragment) && !c0Var.e) {
                break;
            }
        }
        return (c0) obj;
    }

    public final c0 h(Fragment fragment) {
        Object obj;
        ArrayList arrayList = this.c;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                obj = null;
                break;
            }
            obj = arrayList.get(i);
            i++;
            c0 c0Var = (c0) obj;
            if (c0Var.c.equals(fragment) && !c0Var.e) {
                break;
            }
        }
        return (c0) obj;
    }

    public final void i() {
        boolean zIsAttachedToWindow = this.a.isAttachedToWindow();
        synchronized (this.b) {
            n();
            m(this.b);
            ArrayList arrayList = new ArrayList(this.c);
            int size = arrayList.size();
            int i = 0;
            int i2 = 0;
            while (i2 < size) {
                Object obj = arrayList.get(i2);
                i2++;
                ((c0) obj).g = false;
            }
            int size2 = arrayList.size();
            int i3 = 0;
            while (i3 < size2) {
                Object obj2 = arrayList.get(i3);
                i3++;
                c0 c0Var = (c0) obj2;
                if (w.N(2)) {
                    if (!zIsAttachedToWindow) {
                        Objects.toString(this.a);
                    }
                    Objects.toString(c0Var);
                }
                c0Var.a(this.a);
            }
            ArrayList arrayList2 = new ArrayList(this.b);
            int size3 = arrayList2.size();
            int i4 = 0;
            while (i4 < size3) {
                Object obj3 = arrayList2.get(i4);
                i4++;
                ((c0) obj3).g = false;
            }
            int size4 = arrayList2.size();
            while (i < size4) {
                Object obj4 = arrayList2.get(i);
                i++;
                c0 c0Var2 = (c0) obj4;
                if (w.N(2)) {
                    if (!zIsAttachedToWindow) {
                        Objects.toString(this.a);
                    }
                    Objects.toString(c0Var2);
                }
                c0Var2.a(this.a);
            }
        }
    }

    public final void l() {
        Object objPrevious;
        synchronized (this.b) {
            n();
            ArrayList arrayList = this.b;
            ListIterator listIterator = arrayList.listIterator(arrayList.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    objPrevious = null;
                    break;
                }
                objPrevious = listIterator.previous();
                c0 c0Var = (c0) objPrevious;
                View view = c0Var.c.mView;
                char c = 4;
                if (view.getAlpha() != 0.0f || view.getVisibility() != 0) {
                    int visibility = view.getVisibility();
                    if (visibility == 0) {
                        c = 2;
                    } else if (visibility != 4) {
                        if (visibility != 8) {
                            throw new IllegalArgumentException("Unknown visibility " + visibility);
                        }
                        c = 3;
                    }
                }
                if (c0Var.a == 2 && c != 2) {
                    break;
                }
            }
            c0 c0Var2 = (c0) objPrevious;
            Fragment fragment = c0Var2 != null ? c0Var2.c : null;
            this.f = fragment != null ? fragment.isPostponed() : false;
        }
    }

    public final void m(ArrayList arrayList) {
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            c0 c0Var = (c0) arrayList.get(i);
            z zVar = c0Var.l;
            Fragment fragment = zVar.c;
            if (!c0Var.h) {
                c0Var.h = true;
                int i2 = c0Var.b;
                if (i2 == 2) {
                    View viewFindFocus = fragment.mView.findFocus();
                    if (viewFindFocus != null) {
                        fragment.setFocusedView(viewFindFocus);
                        if (w.N(2)) {
                            viewFindFocus.toString();
                            fragment.toString();
                        }
                    }
                    View viewRequireView = c0Var.c.requireView();
                    if (viewRequireView.getParent() == null) {
                        if (w.N(2)) {
                            fragment.toString();
                            viewRequireView.toString();
                        }
                        zVar.a();
                        viewRequireView.setAlpha(0.0f);
                    }
                    if (viewRequireView.getAlpha() == 0.0f && viewRequireView.getVisibility() == 0) {
                        if (w.N(2)) {
                            viewRequireView.toString();
                        }
                        viewRequireView.setVisibility(4);
                    }
                    viewRequireView.setAlpha(fragment.getPostOnViewCreatedAlpha());
                    if (w.N(2)) {
                        fragment.getPostOnViewCreatedAlpha();
                    }
                } else if (i2 == 3) {
                    View viewRequireView2 = fragment.requireView();
                    if (w.N(2)) {
                        Objects.toString(viewRequireView2.findFocus());
                        viewRequireView2.toString();
                        fragment.toString();
                    }
                    viewRequireView2.clearFocus();
                }
            }
        }
        ArrayList arrayList2 = new ArrayList();
        int size2 = arrayList.size();
        int i3 = 0;
        while (i3 < size2) {
            Object obj = arrayList.get(i3);
            i3++;
            o95.t(((c0) obj).k, arrayList2);
        }
        List listK0 = CollectionsKt.k0(CollectionsKt.n0(arrayList2));
        int size3 = listK0.size();
        for (int i4 = 0; i4 < size3; i4++) {
            hyj hyjVar = (hyj) listK0.get(i4);
            if (!hyjVar.a) {
                hyjVar.e(this.a);
            }
            hyjVar.a = true;
        }
    }

    public final void n() {
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            c0 c0Var = (c0) obj;
            int i2 = 2;
            if (c0Var.b == 2) {
                int visibility = c0Var.c.requireView().getVisibility();
                if (visibility != 0) {
                    i2 = 4;
                    if (visibility != 4) {
                        if (visibility != 8) {
                            qp2.o(sko.i(visibility, "Unknown visibility "));
                            return;
                        }
                        i2 = 3;
                    }
                }
                c0Var.d(i2, 1);
            }
        }
    }
}
