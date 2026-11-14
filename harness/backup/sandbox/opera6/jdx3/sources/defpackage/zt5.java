package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;

/* loaded from: classes.dex */
public final class zt5 implements a5n {
    public final /* synthetic */ byte a;
    public final ConstraintLayout b;
    public final TextView c;

    public /* synthetic */ zt5(ConstraintLayout constraintLayout, TextView textView, byte b) {
        this.a = b;
        this.b = constraintLayout;
        this.c = textView;
    }

    public static zt5 a(View view) {
        int i = 2131362126;
        if (((ImageView) w1h.j(2131362126, view)) != null) {
            i = 2131362127;
            TextView textView = (TextView) w1h.j(2131362127, view);
            if (textView != null) {
                return new zt5((ConstraintLayout) view, textView, (byte) 1);
            }
        }
        t3p.q("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        return null;
    }

    public static zt5 b(View view) {
        int i = 2131362126;
        if (((ImageView) w1h.j(2131362126, view)) != null) {
            i = 2131362127;
            TextView textView = (TextView) w1h.j(2131362127, view);
            if (textView != null) {
                i = 2131362205;
                if (((ImageView) w1h.j(2131362205, view)) != null) {
                    i = 2131363062;
                    if (w1h.j(2131363062, view) != null) {
                        i = 2131363064;
                        if (w1h.j(2131363064, view) != null) {
                            i = 2131363066;
                            if (w1h.j(2131363066, view) != null) {
                                i = 2131363067;
                                if (w1h.j(2131363067, view) != null) {
                                    i = 2131363068;
                                    if (w1h.j(2131363068, view) != null) {
                                        i = 2131363069;
                                        if (w1h.j(2131363069, view) != null) {
                                            i = 2131363070;
                                            if (w1h.j(2131363070, view) != null) {
                                                i = 2131363071;
                                                if (w1h.j(2131363071, view) != null) {
                                                    i = 2131363074;
                                                    if (w1h.j(2131363074, view) != null) {
                                                        i = 2131363075;
                                                        if (w1h.j(2131363075, view) != null) {
                                                            i = 2131363076;
                                                            if (w1h.j(2131363076, view) != null) {
                                                                i = 2131363077;
                                                                if (w1h.j(2131363077, view) != null) {
                                                                    i = 2131363078;
                                                                    if (w1h.j(2131363078, view) != null) {
                                                                        i = 2131363079;
                                                                        if (w1h.j(2131363079, view) != null) {
                                                                            i = 2131363080;
                                                                            if (w1h.j(2131363080, view) != null) {
                                                                                i = 2131363081;
                                                                                if (w1h.j(2131363081, view) != null) {
                                                                                    i = 2131363082;
                                                                                    if (w1h.j(2131363082, view) != null) {
                                                                                        i = 2131363083;
                                                                                        if (w1h.j(2131363083, view) != null) {
                                                                                            i = 2131363084;
                                                                                            if (w1h.j(2131363084, view) != null) {
                                                                                                i = 2131363085;
                                                                                                if (w1h.j(2131363085, view) != null) {
                                                                                                    i = 2131363361;
                                                                                                    if (((ImageView) w1h.j(2131363361, view)) != null) {
                                                                                                        i = 2131362869;
                                                                                                        if (((TextView) w1h.j(2131362869, view)) != null) {
                                                                                                            i = 2131363993;
                                                                                                            if (((ImageView) w1h.j(2131363993, view)) != null) {
                                                                                                                return new zt5((ConstraintLayout) view, textView, (byte) 2);
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
                        }
                    }
                }
            }
        }
        t3p.q("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        return null;
    }

    @Override // defpackage.a5n
    public final View getRoot() {
        byte b = this.a;
        return this.b;
    }
}
