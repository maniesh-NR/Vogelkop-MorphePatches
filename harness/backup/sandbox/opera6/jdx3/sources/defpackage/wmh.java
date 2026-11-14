package defpackage;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.opera.android.custom_views.StylingImageButton;
import com.opera.android.custom_views.StylingImageView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

/* loaded from: classes.dex */
public final class wmh extends onh {
    public final pt1 b;
    public final gnh c;
    public c85 d;

    /* JADX WARN: Illegal instructions before constructor call */
    public wmh(pt1 pt1Var, gnh gnhVar) {
        ConstraintLayout constraintLayout = (ConstraintLayout) pt1Var.d;
        super(constraintLayout);
        this.b = pt1Var;
        this.c = gnhVar;
        AppCompatImageView appCompatImageView = (StylingImageView) pt1Var.e;
        kkf kkfVar = new kkf(this, (byte) 9);
        dll dllVarS = q9n.s(appCompatImageView);
        if (dllVarS != null) {
            u8n.b(dllVarS, appCompatImageView, kkfVar);
        }
        final byte b = 0;
        constraintLayout.setOnClickListener(new View.OnClickListener(this) { // from class: vmh
            public final /* synthetic */ wmh b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                byte b2 = b;
                wmh wmhVar = this.b;
                switch (b2) {
                    case 0:
                        c85 c85Var = wmhVar.d;
                        if (c85Var != null) {
                            gnh gnhVar2 = wmhVar.c;
                            if (gnhVar2.h.add(Integer.valueOf(c85Var.a.a))) {
                                gnhVar2.e();
                                break;
                            }
                        }
                        break;
                    case 1:
                        c85 c85Var2 = wmhVar.d;
                        if (c85Var2 != null) {
                            gnh gnhVar3 = wmhVar.c;
                            if (gnhVar3.h.add(Integer.valueOf(c85Var2.a.a))) {
                                gnhVar3.e();
                                break;
                            }
                        }
                        break;
                    default:
                        c85 c85Var3 = wmhVar.d;
                        if (c85Var3 != null) {
                            gnh gnhVar4 = wmhVar.c;
                            ArrayList arrayList = c85Var3.b;
                            gnhVar4.getClass();
                            new xw((Object) arrayList, (Object) gnhVar4, (byte) 8).o(view);
                            break;
                        }
                        break;
                }
            }
        });
        final byte b2 = 1;
        ((StylingImageButton) pt1Var.f).setOnClickListener(new View.OnClickListener(this) { // from class: vmh
            public final /* synthetic */ wmh b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                byte b22 = b2;
                wmh wmhVar = this.b;
                switch (b22) {
                    case 0:
                        c85 c85Var = wmhVar.d;
                        if (c85Var != null) {
                            gnh gnhVar2 = wmhVar.c;
                            if (gnhVar2.h.add(Integer.valueOf(c85Var.a.a))) {
                                gnhVar2.e();
                                break;
                            }
                        }
                        break;
                    case 1:
                        c85 c85Var2 = wmhVar.d;
                        if (c85Var2 != null) {
                            gnh gnhVar3 = wmhVar.c;
                            if (gnhVar3.h.add(Integer.valueOf(c85Var2.a.a))) {
                                gnhVar3.e();
                                break;
                            }
                        }
                        break;
                    default:
                        c85 c85Var3 = wmhVar.d;
                        if (c85Var3 != null) {
                            gnh gnhVar4 = wmhVar.c;
                            ArrayList arrayList = c85Var3.b;
                            gnhVar4.getClass();
                            new xw((Object) arrayList, (Object) gnhVar4, (byte) 8).o(view);
                            break;
                        }
                        break;
                }
            }
        });
        final byte b3 = 2;
        ((StylingImageButton) pt1Var.g).setOnClickListener(new View.OnClickListener(this) { // from class: vmh
            public final /* synthetic */ wmh b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                byte b22 = b3;
                wmh wmhVar = this.b;
                switch (b22) {
                    case 0:
                        c85 c85Var = wmhVar.d;
                        if (c85Var != null) {
                            gnh gnhVar2 = wmhVar.c;
                            if (gnhVar2.h.add(Integer.valueOf(c85Var.a.a))) {
                                gnhVar2.e();
                                break;
                            }
                        }
                        break;
                    case 1:
                        c85 c85Var2 = wmhVar.d;
                        if (c85Var2 != null) {
                            gnh gnhVar3 = wmhVar.c;
                            if (gnhVar3.h.add(Integer.valueOf(c85Var2.a.a))) {
                                gnhVar3.e();
                                break;
                            }
                        }
                        break;
                    default:
                        c85 c85Var3 = wmhVar.d;
                        if (c85Var3 != null) {
                            gnh gnhVar4 = wmhVar.c;
                            ArrayList arrayList = c85Var3.b;
                            gnhVar4.getClass();
                            new xw((Object) arrayList, (Object) gnhVar4, (byte) 8).o(view);
                            break;
                        }
                        break;
                }
            }
        });
    }

    @Override // defpackage.onh
    public final List V() {
        c85 c85Var = this.d;
        ArrayList arrayList = c85Var != null ? c85Var.b : null;
        return arrayList == null ? l08.a : arrayList;
    }

    /* JADX WARN: Type inference failed for: r5v3, types: [android.view.View, com.opera.android.custom_views.StylingImageView] */
    public final void X() {
        c85 c85Var = this.d;
        if (c85Var == null) {
            return;
        }
        k4l k4lVarB = c85Var.a.b();
        ?? r5 = (StylingImageView) this.b.e;
        g8i g8iVar = new g8i(r5.getContext());
        g8iVar.c = k4lVarB.a.a(r5.getContext());
        g8iVar.f = k4lVarB.b.a(r5.getContext());
        String str = String.format(Locale.getDefault(), "%d", Arrays.copyOf(new Object[]{Integer.valueOf(c85Var.b.size())}, 1));
        if (str.length() > 2) {
            str = "…";
        }
        g8iVar.e = str;
        r5.setImageDrawable(g8iVar.a());
    }
}
