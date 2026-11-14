package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.PopupWindow;

/* loaded from: classes.dex */
public final class oig implements eig, View.OnClickListener, PopupWindow.OnDismissListener {
    public final /* synthetic */ uig a;

    public oig(uig uigVar) {
        this.a = uigVar;
    }

    @Override // defpackage.eig
    public final void c(dig digVar) {
        w69 w69Var = digVar.a;
        boolean zA = w69Var.a(4, 5, 13);
        uig uigVar = this.a;
        if (zA) {
            uigVar.n();
        }
        if (w69Var.a(4, 5, 7, 13)) {
            uigVar.p();
        }
        if (w69Var.a(8, 13)) {
            uigVar.q();
        }
        if (w69Var.a(9, 13)) {
            uigVar.s();
        }
        if (w69Var.a(8, 9, 11, 0, 16, 17, 13)) {
            uigVar.m();
        }
        if (w69Var.a(11, 0, 13)) {
            uigVar.t();
        }
        if (w69Var.a(12, 13)) {
            uigVar.o();
        }
        if (w69Var.a(2, 13)) {
            uigVar.u();
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        uig uigVar = this.a;
        ImageView imageView = uigVar.B;
        View view2 = uigVar.G;
        View view3 = uigVar.F;
        View view4 = uigVar.E;
        zig zigVar = uigVar.a;
        gig gigVar = uigVar.o0;
        if (gigVar != null) {
            zigVar.f();
            if (uigVar.t == view) {
                if (gigVar.C(9)) {
                    gigVar.M();
                    return;
                }
                return;
            }
            if (uigVar.s == view) {
                if (gigVar.C(7)) {
                    gigVar.r();
                    return;
                }
                return;
            }
            if (uigVar.v == view) {
                if (gigVar.getPlaybackState() == 4 || !gigVar.C(12)) {
                    return;
                }
                gigVar.o0();
                return;
            }
            if (uigVar.w == view) {
                if (gigVar.C(11)) {
                    gigVar.p0();
                    return;
                }
                return;
            }
            if (uigVar.u == view) {
                if (tym.Y(gigVar, uigVar.r0)) {
                    tym.F(gigVar);
                    return;
                } else {
                    tym.E(gigVar);
                    return;
                }
            }
            if (uigVar.z == view) {
                if (gigVar.C(15)) {
                    int repeatMode = gigVar.getRepeatMode();
                    int i = uigVar.w0;
                    for (int i2 = 1; i2 <= 2; i2++) {
                        int i3 = (repeatMode + i2) % 3;
                        if (i3 != 0) {
                            if (i3 != 1) {
                                if (i3 != 2 || (i & 2) == 0) {
                                }
                            } else if ((i & 1) == 0) {
                            }
                        }
                        repeatMode = i3;
                    }
                    gigVar.setRepeatMode(repeatMode);
                    return;
                }
                return;
            }
            if (uigVar.A == view) {
                if (gigVar.C(14)) {
                    gigVar.setShuffleModeEnabled(!gigVar.getShuffleModeEnabled());
                    return;
                }
                return;
            }
            if (view4 == view) {
                zigVar.e();
                uigVar.b(uigVar.l, view4);
                return;
            }
            if (view3 == view) {
                zigVar.e();
                uigVar.b(uigVar.m, view3);
            } else if (view2 == view) {
                zigVar.e();
                uigVar.b(uigVar.o, view2);
            } else if (imageView == view) {
                zigVar.e();
                uigVar.b(uigVar.n, imageView);
            }
        }
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        uig uigVar = this.a;
        if (uigVar.C0) {
            uigVar.a.f();
        }
    }
}
