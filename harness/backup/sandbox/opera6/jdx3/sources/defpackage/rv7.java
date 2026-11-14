package defpackage;

import android.view.View;
import android.widget.FrameLayout;
import com.opera.android.Lazy;
import com.opera.android.custom_views.StylingImageCheckableWithText;
import com.opera.android.widget.UrlFieldEditText;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class rv7 {
    public final fe5 a;
    public final pde b;
    public final FrameLayout c;
    public final hz4 d;
    public final iv7 e;
    public final p8f f;
    public final pde g;
    public final jv3 h;
    public final tsd i;
    public final wzg j;
    public final igi k;
    public final j1k l;
    public final hd m;
    public final yv7 n;
    public final mlj o;
    public final ks6 p;
    public final mv7 q;
    public boolean r;
    public fbn s;
    public final xpm t;
    public final pde u;
    public final qde v;
    public pv7 w;

    public rv7(fe5 fe5Var, pde pdeVar, FrameLayout frameLayout, hz4 hz4Var, iv7 iv7Var, ky1 ky1Var, x5f x5fVar, ysj ysjVar, jv3 jv3Var, p8f p8fVar, pde pdeVar2, jv3 jv3Var2, tsd tsdVar, wzg wzgVar, igi igiVar, ki kiVar, j1k j1kVar) {
        this.a = fe5Var;
        this.b = pdeVar;
        this.c = frameLayout;
        this.d = hz4Var;
        this.e = iv7Var;
        this.f = p8fVar;
        this.g = pdeVar2;
        this.h = jv3Var2;
        this.i = tsdVar;
        this.j = wzgVar;
        this.k = igiVar;
        this.l = j1kVar;
        hd hdVar = new hd(fe5Var, iv7Var, ky1Var, x5fVar, ysjVar, jv3Var);
        this.m = hdVar;
        final byte b = 0;
        final byte b2 = 1;
        yv7 yv7Var = new yv7(fe5Var, frameLayout.getContext(), hz4Var, iv7Var, new qv7(0, this, rv7.class, "onClearUrlFieldClicked", "onClearUrlFieldClicked()V", 0, (byte) 0), new lv7(this, b), new lv7(this, b2), igiVar, kiVar, x5fVar);
        this.n = yv7Var;
        this.o = new mlj(ysjVar, null);
        this.p = new ks6(this, (byte) 3);
        this.q = new mv7(this, b);
        this.t = yv7Var.o;
        this.u = yv7Var.i;
        this.v = (qde) hdVar.g;
        pdeVar.j(fe5Var, new ug(new Function1(this) { // from class: nv7
            public final /* synthetic */ rv7 b;

            {
                this.b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r11v1, types: [android.view.View$OnClickListener, android.view.View$OnKeyListener, android.view.View$OnLongClickListener, android.widget.TextView$OnEditorActionListener, xv7, z6f] */
            /* JADX WARN: Type inference failed for: r8v3, types: [android.view.View, android.widget.EditText, android.widget.TextView, com.opera.android.custom_views.ObservableEditText, com.opera.android.custom_views.OperaEditText, com.opera.android.widget.UrlFieldEditText] */
            /* JADX WARN: Type inference failed for: r9v7, types: [android.view.View, android.widget.TextView, com.opera.android.widget.UrlFieldEditText] */
            public final Object invoke(Object obj) {
                byte b3 = b;
                rv7 rv7Var = this.b;
                switch (b3) {
                    case 0:
                        rv7 rv7Var2 = this.b;
                        pde pdeVar3 = rv7Var2.b;
                        Object objG = pdeVar3.g();
                        pv7 pv7Var = rv7Var2.w;
                        if (!Intrinsics.a(objG, pv7Var != null ? pv7Var.a : null)) {
                            pv7 pv7Var2 = rv7Var2.w;
                            pv7 pv7Var3 = new pv7(rv7Var2, (fyj) pdeVar3.g(), rv7Var2.e, rv7Var2.i, rv7Var2.j);
                            yv7 yv7Var2 = rv7Var2.n;
                            ha6 ha6Var = pv7Var3.b;
                            ?? r8 = (UrlFieldEditText) ha6Var.d;
                            bq1 bq1Var = yv7Var2.l;
                            View.OnAttachStateChangeListener onAttachStateChangeListener = yv7Var2.k;
                            bq1Var.removeOnAttachStateChangeListener(onAttachStateChangeListener);
                            UrlFieldEditText urlFieldEditText = yv7Var2.l;
                            ?? r11 = yv7Var2.n;
                            urlFieldEditText.H(r11);
                            yv7Var2.l.setOnEditorActionListener(null);
                            yv7Var2.l.setOnClickListener(null);
                            yv7Var2.l.setOnLongClickListener(null);
                            yv7Var2.l.setOnKeyListener(null);
                            boolean zS = yv7Var2.l.s();
                            ?? r9 = yv7Var2.l;
                            int selectionStart = r9.getSelectionStart();
                            int selectionEnd = r9.getSelectionEnd();
                            if (r9.isFocused()) {
                                r8.requestFocus();
                            }
                            boolean zBooleanValue = ((Boolean) r9.w.g()).booleanValue();
                            r8.A(true);
                            r8.F = r9.F;
                            r8.G = r9.G;
                            r8.b0 = r9.b0;
                            CharSequence hint = r9.getHint();
                            if (hint != null) {
                                r8.g(hint.toString());
                            }
                            r8.D();
                            if (r9.s()) {
                                r8.p();
                                r8.getEditableText().append(r9.r());
                                r8.x.h = true;
                            } else {
                                CharSequence charSequenceR = r9.r();
                                r8.setText(charSequenceR);
                                if (selectionStart <= charSequenceR.length() && selectionEnd <= charSequenceR.length() && selectionStart >= 0 && selectionEnd >= 0) {
                                    r8.setSelection(selectionStart, selectionEnd);
                                }
                            }
                            r8.A(zBooleanValue);
                            yv7Var2.l = r8;
                            r8.h0 = true;
                            xpm xpmVar = yv7Var2.o;
                            g9l g9lVar = xpmVar.d;
                            ArrayList arrayList = xpmVar.b;
                            int size = arrayList.size();
                            int i = 0;
                            while (i < size) {
                                Object obj2 = arrayList.get(i);
                                i++;
                                xpmVar.a.H((z6f) obj2);
                            }
                            xpmVar.a.w.p(g9lVar);
                            xpmVar.a = r8;
                            int size2 = arrayList.size();
                            int i2 = 0;
                            while (i2 < size2) {
                                Object obj3 = arrayList.get(i2);
                                i2++;
                                r8.F((z6f) obj3);
                            }
                            r8.w.k(g9lVar);
                            yv7Var2.o();
                            yv7Var2.l.addOnAttachStateChangeListener(onAttachStateChangeListener);
                            yv7Var2.l.F(r11);
                            yv7Var2.l.setOnEditorActionListener(r11);
                            yv7Var2.l.setOnClickListener(r11);
                            yv7Var2.l.setOnLongClickListener(r11);
                            yv7Var2.l.setOnKeyListener(r11);
                            if (zS) {
                                r11.b.k(r11.e.l.r().toString());
                            }
                            StylingImageCheckableWithText stylingImageCheckableWithText = (StylingImageCheckableWithText) ha6Var.m;
                            if (stylingImageCheckableWithText != null) {
                                stylingImageCheckableWithText.u(rv7Var2.m.b);
                            }
                            rv7Var2.w = pv7Var3;
                            rv7Var2.d();
                            if (pv7Var2 != null) {
                                fe5 fe5Var2 = pv7Var2.c;
                                fe5Var2.d = true;
                                fe5Var2.b();
                                pv7Var2.e.c.removeView((FrameLayout) pv7Var2.b.a);
                            }
                        }
                        break;
                    case 1:
                        hbn hbnVar = (hbn) obj;
                        igi igiVar2 = rv7Var.k;
                        ks6 ks6Var = rv7Var.p;
                        rv7Var.r = false;
                        mv7 mv7Var = rv7Var.q;
                        vml.a(mv7Var);
                        if (!(hbnVar instanceof gbn)) {
                            if (!(hbnVar instanceof bbn)) {
                                if (!(hbnVar instanceof fbn) && !Intrinsics.a(hbnVar, cbn.a) && !(hbnVar instanceof ebn) && !Intrinsics.a(hbnVar, dbn.a) && hbnVar != null) {
                                    h9o.p();
                                    break;
                                }
                            } else {
                                ode odeVar = ((bbn) hbnVar).c;
                                odeVar.p(ks6Var);
                                ode odeVar2 = (ode) igiVar2.f;
                                Object objG2 = odeVar2.g();
                                odeVar.k(ks6Var);
                                odeVar2.k(new edb(objG2, (ekc) odeVar, (f7f) ks6Var, odeVar2));
                            }
                        } else {
                            vml.d(mv7Var, pn7.f(jbn.h));
                        }
                        if (!(hbnVar instanceof fbn)) {
                            rv7Var.s = null;
                        } else if (hbnVar != rv7Var.s) {
                            fbn fbnVar = (fbn) hbnVar;
                            zan zanVar = fbnVar.a;
                            rv7Var.s = fbnVar;
                            switch (zanVar.ordinal()) {
                                case 0:
                                case 1:
                                case 3:
                                case 4:
                                case 5:
                                case 6:
                                    int i3 = jbn.i;
                                    rxh rxhVarN = zch.n(zanVar);
                                    if (rxhVarN != null) {
                                        rv7Var.o.b(rxhVarN, 5000, new rxh(2132020924), new lv7(rv7Var, (byte) 2));
                                        break;
                                    }
                                    break;
                                case 2:
                                    z5i.u0(rv7Var.c.getContext(), wwc.f((String) ((jbn) ((Lazy) igiVar2.b).get()).a().g()));
                                    break;
                                default:
                                    h9o.p();
                                    break;
                            }
                        }
                        rv7Var.d();
                        break;
                    default:
                        rv7Var.c(true);
                        rv7Var.d();
                        break;
                }
                return Unit.a;
            }
        }, (byte) 20));
        ((ode) igiVar.f).j(fe5Var, new ug(new Function1(this) { // from class: nv7
            public final /* synthetic */ rv7 b;

            {
                this.b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r11v1, types: [android.view.View$OnClickListener, android.view.View$OnKeyListener, android.view.View$OnLongClickListener, android.widget.TextView$OnEditorActionListener, xv7, z6f] */
            /* JADX WARN: Type inference failed for: r8v3, types: [android.view.View, android.widget.EditText, android.widget.TextView, com.opera.android.custom_views.ObservableEditText, com.opera.android.custom_views.OperaEditText, com.opera.android.widget.UrlFieldEditText] */
            /* JADX WARN: Type inference failed for: r9v7, types: [android.view.View, android.widget.TextView, com.opera.android.widget.UrlFieldEditText] */
            public final Object invoke(Object obj) {
                byte b3 = b2;
                rv7 rv7Var = this.b;
                switch (b3) {
                    case 0:
                        rv7 rv7Var2 = this.b;
                        pde pdeVar3 = rv7Var2.b;
                        Object objG = pdeVar3.g();
                        pv7 pv7Var = rv7Var2.w;
                        if (!Intrinsics.a(objG, pv7Var != null ? pv7Var.a : null)) {
                            pv7 pv7Var2 = rv7Var2.w;
                            pv7 pv7Var3 = new pv7(rv7Var2, (fyj) pdeVar3.g(), rv7Var2.e, rv7Var2.i, rv7Var2.j);
                            yv7 yv7Var2 = rv7Var2.n;
                            ha6 ha6Var = pv7Var3.b;
                            ?? r8 = (UrlFieldEditText) ha6Var.d;
                            bq1 bq1Var = yv7Var2.l;
                            View.OnAttachStateChangeListener onAttachStateChangeListener = yv7Var2.k;
                            bq1Var.removeOnAttachStateChangeListener(onAttachStateChangeListener);
                            UrlFieldEditText urlFieldEditText = yv7Var2.l;
                            ?? r11 = yv7Var2.n;
                            urlFieldEditText.H(r11);
                            yv7Var2.l.setOnEditorActionListener(null);
                            yv7Var2.l.setOnClickListener(null);
                            yv7Var2.l.setOnLongClickListener(null);
                            yv7Var2.l.setOnKeyListener(null);
                            boolean zS = yv7Var2.l.s();
                            ?? r9 = yv7Var2.l;
                            int selectionStart = r9.getSelectionStart();
                            int selectionEnd = r9.getSelectionEnd();
                            if (r9.isFocused()) {
                                r8.requestFocus();
                            }
                            boolean zBooleanValue = ((Boolean) r9.w.g()).booleanValue();
                            r8.A(true);
                            r8.F = r9.F;
                            r8.G = r9.G;
                            r8.b0 = r9.b0;
                            CharSequence hint = r9.getHint();
                            if (hint != null) {
                                r8.g(hint.toString());
                            }
                            r8.D();
                            if (r9.s()) {
                                r8.p();
                                r8.getEditableText().append(r9.r());
                                r8.x.h = true;
                            } else {
                                CharSequence charSequenceR = r9.r();
                                r8.setText(charSequenceR);
                                if (selectionStart <= charSequenceR.length() && selectionEnd <= charSequenceR.length() && selectionStart >= 0 && selectionEnd >= 0) {
                                    r8.setSelection(selectionStart, selectionEnd);
                                }
                            }
                            r8.A(zBooleanValue);
                            yv7Var2.l = r8;
                            r8.h0 = true;
                            xpm xpmVar = yv7Var2.o;
                            g9l g9lVar = xpmVar.d;
                            ArrayList arrayList = xpmVar.b;
                            int size = arrayList.size();
                            int i = 0;
                            while (i < size) {
                                Object obj2 = arrayList.get(i);
                                i++;
                                xpmVar.a.H((z6f) obj2);
                            }
                            xpmVar.a.w.p(g9lVar);
                            xpmVar.a = r8;
                            int size2 = arrayList.size();
                            int i2 = 0;
                            while (i2 < size2) {
                                Object obj3 = arrayList.get(i2);
                                i2++;
                                r8.F((z6f) obj3);
                            }
                            r8.w.k(g9lVar);
                            yv7Var2.o();
                            yv7Var2.l.addOnAttachStateChangeListener(onAttachStateChangeListener);
                            yv7Var2.l.F(r11);
                            yv7Var2.l.setOnEditorActionListener(r11);
                            yv7Var2.l.setOnClickListener(r11);
                            yv7Var2.l.setOnLongClickListener(r11);
                            yv7Var2.l.setOnKeyListener(r11);
                            if (zS) {
                                r11.b.k(r11.e.l.r().toString());
                            }
                            StylingImageCheckableWithText stylingImageCheckableWithText = (StylingImageCheckableWithText) ha6Var.m;
                            if (stylingImageCheckableWithText != null) {
                                stylingImageCheckableWithText.u(rv7Var2.m.b);
                            }
                            rv7Var2.w = pv7Var3;
                            rv7Var2.d();
                            if (pv7Var2 != null) {
                                fe5 fe5Var2 = pv7Var2.c;
                                fe5Var2.d = true;
                                fe5Var2.b();
                                pv7Var2.e.c.removeView((FrameLayout) pv7Var2.b.a);
                            }
                        }
                        break;
                    case 1:
                        hbn hbnVar = (hbn) obj;
                        igi igiVar2 = rv7Var.k;
                        ks6 ks6Var = rv7Var.p;
                        rv7Var.r = false;
                        mv7 mv7Var = rv7Var.q;
                        vml.a(mv7Var);
                        if (!(hbnVar instanceof gbn)) {
                            if (!(hbnVar instanceof bbn)) {
                                if (!(hbnVar instanceof fbn) && !Intrinsics.a(hbnVar, cbn.a) && !(hbnVar instanceof ebn) && !Intrinsics.a(hbnVar, dbn.a) && hbnVar != null) {
                                    h9o.p();
                                    break;
                                }
                            } else {
                                ode odeVar = ((bbn) hbnVar).c;
                                odeVar.p(ks6Var);
                                ode odeVar2 = (ode) igiVar2.f;
                                Object objG2 = odeVar2.g();
                                odeVar.k(ks6Var);
                                odeVar2.k(new edb(objG2, (ekc) odeVar, (f7f) ks6Var, odeVar2));
                            }
                        } else {
                            vml.d(mv7Var, pn7.f(jbn.h));
                        }
                        if (!(hbnVar instanceof fbn)) {
                            rv7Var.s = null;
                        } else if (hbnVar != rv7Var.s) {
                            fbn fbnVar = (fbn) hbnVar;
                            zan zanVar = fbnVar.a;
                            rv7Var.s = fbnVar;
                            switch (zanVar.ordinal()) {
                                case 0:
                                case 1:
                                case 3:
                                case 4:
                                case 5:
                                case 6:
                                    int i3 = jbn.i;
                                    rxh rxhVarN = zch.n(zanVar);
                                    if (rxhVarN != null) {
                                        rv7Var.o.b(rxhVarN, 5000, new rxh(2132020924), new lv7(rv7Var, (byte) 2));
                                        break;
                                    }
                                    break;
                                case 2:
                                    z5i.u0(rv7Var.c.getContext(), wwc.f((String) ((jbn) ((Lazy) igiVar2.b).get()).a().g()));
                                    break;
                                default:
                                    h9o.p();
                                    break;
                            }
                        }
                        rv7Var.d();
                        break;
                    default:
                        rv7Var.c(true);
                        rv7Var.d();
                        break;
                }
                return Unit.a;
            }
        }, (byte) 20));
        final byte b3 = 2;
        iv7Var.f.j(fe5Var, new ug(new Function1(this) { // from class: nv7
            public final /* synthetic */ rv7 b;

            {
                this.b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r11v1, types: [android.view.View$OnClickListener, android.view.View$OnKeyListener, android.view.View$OnLongClickListener, android.widget.TextView$OnEditorActionListener, xv7, z6f] */
            /* JADX WARN: Type inference failed for: r8v3, types: [android.view.View, android.widget.EditText, android.widget.TextView, com.opera.android.custom_views.ObservableEditText, com.opera.android.custom_views.OperaEditText, com.opera.android.widget.UrlFieldEditText] */
            /* JADX WARN: Type inference failed for: r9v7, types: [android.view.View, android.widget.TextView, com.opera.android.widget.UrlFieldEditText] */
            public final Object invoke(Object obj) {
                byte b32 = b3;
                rv7 rv7Var = this.b;
                switch (b32) {
                    case 0:
                        rv7 rv7Var2 = this.b;
                        pde pdeVar3 = rv7Var2.b;
                        Object objG = pdeVar3.g();
                        pv7 pv7Var = rv7Var2.w;
                        if (!Intrinsics.a(objG, pv7Var != null ? pv7Var.a : null)) {
                            pv7 pv7Var2 = rv7Var2.w;
                            pv7 pv7Var3 = new pv7(rv7Var2, (fyj) pdeVar3.g(), rv7Var2.e, rv7Var2.i, rv7Var2.j);
                            yv7 yv7Var2 = rv7Var2.n;
                            ha6 ha6Var = pv7Var3.b;
                            ?? r8 = (UrlFieldEditText) ha6Var.d;
                            bq1 bq1Var = yv7Var2.l;
                            View.OnAttachStateChangeListener onAttachStateChangeListener = yv7Var2.k;
                            bq1Var.removeOnAttachStateChangeListener(onAttachStateChangeListener);
                            UrlFieldEditText urlFieldEditText = yv7Var2.l;
                            ?? r11 = yv7Var2.n;
                            urlFieldEditText.H(r11);
                            yv7Var2.l.setOnEditorActionListener(null);
                            yv7Var2.l.setOnClickListener(null);
                            yv7Var2.l.setOnLongClickListener(null);
                            yv7Var2.l.setOnKeyListener(null);
                            boolean zS = yv7Var2.l.s();
                            ?? r9 = yv7Var2.l;
                            int selectionStart = r9.getSelectionStart();
                            int selectionEnd = r9.getSelectionEnd();
                            if (r9.isFocused()) {
                                r8.requestFocus();
                            }
                            boolean zBooleanValue = ((Boolean) r9.w.g()).booleanValue();
                            r8.A(true);
                            r8.F = r9.F;
                            r8.G = r9.G;
                            r8.b0 = r9.b0;
                            CharSequence hint = r9.getHint();
                            if (hint != null) {
                                r8.g(hint.toString());
                            }
                            r8.D();
                            if (r9.s()) {
                                r8.p();
                                r8.getEditableText().append(r9.r());
                                r8.x.h = true;
                            } else {
                                CharSequence charSequenceR = r9.r();
                                r8.setText(charSequenceR);
                                if (selectionStart <= charSequenceR.length() && selectionEnd <= charSequenceR.length() && selectionStart >= 0 && selectionEnd >= 0) {
                                    r8.setSelection(selectionStart, selectionEnd);
                                }
                            }
                            r8.A(zBooleanValue);
                            yv7Var2.l = r8;
                            r8.h0 = true;
                            xpm xpmVar = yv7Var2.o;
                            g9l g9lVar = xpmVar.d;
                            ArrayList arrayList = xpmVar.b;
                            int size = arrayList.size();
                            int i = 0;
                            while (i < size) {
                                Object obj2 = arrayList.get(i);
                                i++;
                                xpmVar.a.H((z6f) obj2);
                            }
                            xpmVar.a.w.p(g9lVar);
                            xpmVar.a = r8;
                            int size2 = arrayList.size();
                            int i2 = 0;
                            while (i2 < size2) {
                                Object obj3 = arrayList.get(i2);
                                i2++;
                                r8.F((z6f) obj3);
                            }
                            r8.w.k(g9lVar);
                            yv7Var2.o();
                            yv7Var2.l.addOnAttachStateChangeListener(onAttachStateChangeListener);
                            yv7Var2.l.F(r11);
                            yv7Var2.l.setOnEditorActionListener(r11);
                            yv7Var2.l.setOnClickListener(r11);
                            yv7Var2.l.setOnLongClickListener(r11);
                            yv7Var2.l.setOnKeyListener(r11);
                            if (zS) {
                                r11.b.k(r11.e.l.r().toString());
                            }
                            StylingImageCheckableWithText stylingImageCheckableWithText = (StylingImageCheckableWithText) ha6Var.m;
                            if (stylingImageCheckableWithText != null) {
                                stylingImageCheckableWithText.u(rv7Var2.m.b);
                            }
                            rv7Var2.w = pv7Var3;
                            rv7Var2.d();
                            if (pv7Var2 != null) {
                                fe5 fe5Var2 = pv7Var2.c;
                                fe5Var2.d = true;
                                fe5Var2.b();
                                pv7Var2.e.c.removeView((FrameLayout) pv7Var2.b.a);
                            }
                        }
                        break;
                    case 1:
                        hbn hbnVar = (hbn) obj;
                        igi igiVar2 = rv7Var.k;
                        ks6 ks6Var = rv7Var.p;
                        rv7Var.r = false;
                        mv7 mv7Var = rv7Var.q;
                        vml.a(mv7Var);
                        if (!(hbnVar instanceof gbn)) {
                            if (!(hbnVar instanceof bbn)) {
                                if (!(hbnVar instanceof fbn) && !Intrinsics.a(hbnVar, cbn.a) && !(hbnVar instanceof ebn) && !Intrinsics.a(hbnVar, dbn.a) && hbnVar != null) {
                                    h9o.p();
                                    break;
                                }
                            } else {
                                ode odeVar = ((bbn) hbnVar).c;
                                odeVar.p(ks6Var);
                                ode odeVar2 = (ode) igiVar2.f;
                                Object objG2 = odeVar2.g();
                                odeVar.k(ks6Var);
                                odeVar2.k(new edb(objG2, (ekc) odeVar, (f7f) ks6Var, odeVar2));
                            }
                        } else {
                            vml.d(mv7Var, pn7.f(jbn.h));
                        }
                        if (!(hbnVar instanceof fbn)) {
                            rv7Var.s = null;
                        } else if (hbnVar != rv7Var.s) {
                            fbn fbnVar = (fbn) hbnVar;
                            zan zanVar = fbnVar.a;
                            rv7Var.s = fbnVar;
                            switch (zanVar.ordinal()) {
                                case 0:
                                case 1:
                                case 3:
                                case 4:
                                case 5:
                                case 6:
                                    int i3 = jbn.i;
                                    rxh rxhVarN = zch.n(zanVar);
                                    if (rxhVarN != null) {
                                        rv7Var.o.b(rxhVarN, 5000, new rxh(2132020924), new lv7(rv7Var, (byte) 2));
                                        break;
                                    }
                                    break;
                                case 2:
                                    z5i.u0(rv7Var.c.getContext(), wwc.f((String) ((jbn) ((Lazy) igiVar2.b).get()).a().g()));
                                    break;
                                default:
                                    h9o.p();
                                    break;
                            }
                        }
                        rv7Var.d();
                        break;
                    default:
                        rv7Var.c(true);
                        rv7Var.d();
                        break;
                }
                return Unit.a;
            }
        }, (byte) 20));
    }

    public final void a() {
        yv7 yv7Var = this.n;
        if (yv7Var.l.hasSelection()) {
            bq1 bq1Var = yv7Var.l;
            bq1Var.setSelection(bq1Var.getSelectionEnd());
        }
    }

    public final void b(lbf lbfVar, Integer num) {
        ha6 ha6Var;
        StylingImageCheckableWithText stylingImageCheckableWithText;
        ha6 ha6Var2;
        StylingImageCheckableWithText stylingImageCheckableWithText2;
        pv7 pv7Var = this.w;
        boolean z = (pv7Var == null || (ha6Var2 = pv7Var.b) == null || (stylingImageCheckableWithText2 = (StylingImageCheckableWithText) ha6Var2.m) == null) ? false : stylingImageCheckableWithText2.u;
        if (pv7Var != null && (ha6Var = pv7Var.b) != null && (stylingImageCheckableWithText = (StylingImageCheckableWithText) ha6Var.m) != null) {
            stylingImageCheckableWithText.s();
        }
        lbf lbfVar2 = lbf.a;
        hd hdVar = this.m;
        if (lbfVar != lbfVar2) {
            iy1 iy1Var = (iy1) hdVar.f;
            iy1Var.j.c((List) iy1Var.m.g(), z ? ez1.c : (num == null || num.intValue() != 30) ? (num == null || num.intValue() != 31) ? ez1.c : ez1.b : ez1.a, z);
        }
        ((iy1) hdVar.f).b();
    }

    public final void c(boolean z) {
        this.k.y0();
        if (z && ((Boolean) this.l.invoke()).booleanValue()) {
            this.c.post(new mv7(this, (byte) 1));
        }
    }

    public final void d() {
        String string;
        hbn hbnVar = (hbn) ((ode) this.k.f).g();
        boolean z = hbnVar instanceof bbn;
        int i = 1;
        iv7 iv7Var = this.e;
        FrameLayout frameLayout = this.c;
        if (z) {
            string = frameLayout.getContext().getString(2132017442);
        } else {
            if (Intrinsics.a(hbnVar, cbn.a) || (hbnVar instanceof ebn) || (hbnVar instanceof fbn) || (hbnVar instanceof gbn) || Intrinsics.a(hbnVar, dbn.a)) {
                if (this.r) {
                    string = frameLayout.getContext().getString(2132017506);
                } else {
                    string = iv7Var.b() || iv7Var.c.b().getId() == 9223372036854775804L ? frameLayout.getContext().getString(2132017497) : frameLayout.getContext().getString(2132022073);
                }
            } else {
                if (hbnVar != null) {
                    h9o.p();
                    return;
                }
                string = iv7Var.b() || iv7Var.c.b().getId() == 9223372036854775804L ? frameLayout.getContext().getString(2132017497) : frameLayout.getContext().getString(2132022073);
            }
        }
        yv7 yv7Var = this.n;
        yv7Var.l.g(string);
        if (!iv7Var.b() && iv7Var.c.b().getId() != 9223372036854775804L) {
            i = 17;
        }
        if (yv7Var.l.getInputType() != i) {
            yv7Var.l.setInputType(i);
        }
    }
}
