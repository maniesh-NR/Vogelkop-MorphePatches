package defpackage;

import android.os.SystemClock;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.opera.android.bubbleview.BubbleView;

/* loaded from: classes.dex */
public class lz3 implements pim {
    public final ViewGroup a;
    public final BubbleView b;
    public final i7f c;
    public final long d;
    public long e;

    public lz3(int i, ViewGroup viewGroup, long j, jz3 jz3Var, hxj hxjVar, boolean z, boolean z2) {
        this.c = new i7f();
        this.a = viewGroup;
        this.d = Math.max(j, 0L);
        BubbleView bubbleViewA = jz3Var.a(this, LayoutInflater.from(i != -1 ? new dkf(viewGroup.getContext(), i) : viewGroup.getContext()), viewGroup);
        this.b = bubbleViewA;
        final byte b = 0;
        bubbleViewA.findViewById(2131362414).setOnClickListener(new hz3(b, this, z));
        if (z2) {
            bubbleViewA.setFocusable(false);
            bubbleViewA.setOnClickListener(new View.OnClickListener(this) { // from class: iz3
                public final /* synthetic */ lz3 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    byte b2 = b;
                    hjm hjmVar = hjm.a;
                    lz3 lz3Var = this.b;
                    switch (b2) {
                        case 0:
                            lz3Var.b(hjmVar);
                            break;
                        case 1:
                            i7f i7fVar = lz3Var.c;
                            g7f g7fVarC = u35.c(i7fVar, i7fVar);
                            while (g7fVarC.hasNext()) {
                                ((kz3) g7fVarC.next()).d();
                            }
                            lz3Var.b(hjmVar);
                            break;
                        default:
                            i7f i7fVar2 = lz3Var.c;
                            g7f g7fVarC2 = u35.c(i7fVar2, i7fVar2);
                            while (g7fVarC2.hasNext()) {
                                ((kz3) g7fVarC2.next()).e();
                            }
                            lz3Var.b(hjmVar);
                            break;
                    }
                }
            });
        }
        View viewFindViewById = bubbleViewA.findViewById(2131362353);
        if (viewFindViewById != null) {
            final byte b2 = 1;
            viewFindViewById.setOnClickListener(new View.OnClickListener(this) { // from class: iz3
                public final /* synthetic */ lz3 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    byte b22 = b2;
                    hjm hjmVar = hjm.a;
                    lz3 lz3Var = this.b;
                    switch (b22) {
                        case 0:
                            lz3Var.b(hjmVar);
                            break;
                        case 1:
                            i7f i7fVar = lz3Var.c;
                            g7f g7fVarC = u35.c(i7fVar, i7fVar);
                            while (g7fVarC.hasNext()) {
                                ((kz3) g7fVarC.next()).d();
                            }
                            lz3Var.b(hjmVar);
                            break;
                        default:
                            i7f i7fVar2 = lz3Var.c;
                            g7f g7fVarC2 = u35.c(i7fVar2, i7fVar2);
                            while (g7fVarC2.hasNext()) {
                                ((kz3) g7fVarC2.next()).e();
                            }
                            lz3Var.b(hjmVar);
                            break;
                    }
                }
            });
        }
        View viewFindViewById2 = bubbleViewA.findViewById(2131361862);
        if (viewFindViewById2 != null) {
            final byte b3 = 2;
            viewFindViewById2.setOnClickListener(new View.OnClickListener(this) { // from class: iz3
                public final /* synthetic */ lz3 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    byte b22 = b3;
                    hjm hjmVar = hjm.a;
                    lz3 lz3Var = this.b;
                    switch (b22) {
                        case 0:
                            lz3Var.b(hjmVar);
                            break;
                        case 1:
                            i7f i7fVar = lz3Var.c;
                            g7f g7fVarC = u35.c(i7fVar, i7fVar);
                            while (g7fVarC.hasNext()) {
                                ((kz3) g7fVarC.next()).d();
                            }
                            lz3Var.b(hjmVar);
                            break;
                        default:
                            i7f i7fVar2 = lz3Var.c;
                            g7f g7fVarC2 = u35.c(i7fVar2, i7fVar2);
                            while (g7fVarC2.hasNext()) {
                                ((kz3) g7fVarC2.next()).e();
                            }
                            lz3Var.b(hjmVar);
                            break;
                    }
                }
            });
        }
        bubbleViewA.v = this;
        bubbleViewA.w = this;
        bubbleViewA.n = hxjVar;
    }

    public lz3(ViewGroup viewGroup, int i, long j, hxj hxjVar) {
        this(-1, viewGroup, j, new gz3((byte) 0, i), hxjVar, true, false);
    }

    public lz3(ViewGroup viewGroup, int i, l11 l11Var) {
        this(viewGroup, i, 0L, l11Var);
    }

    public final void a(kz3 kz3Var) {
        this.c.b(kz3Var);
    }

    public final boolean b(hjm hjmVar) {
        BubbleView bubbleView = this.b;
        if (bubbleView.getParent() == null) {
            return false;
        }
        i7f i7fVar = this.c;
        g7f g7fVarC = u35.c(i7fVar, i7fVar);
        while (g7fVarC.hasNext()) {
            ((kz3) g7fVarC.next()).b(hjmVar);
        }
        this.a.removeView(bubbleView);
        return true;
    }

    public void c(boolean z) {
        i7f i7fVar = this.c;
        g7f g7fVarC = u35.c(i7fVar, i7fVar);
        while (g7fVarC.hasNext()) {
            ((kz3) g7fVarC.next()).c(z);
        }
    }

    public boolean d(boolean z) {
        if (!e(z)) {
            return false;
        }
        b(hjm.b);
        return false;
    }

    public boolean e(boolean z) {
        long j = this.d;
        return j != Long.MAX_VALUE && this.e + j <= SystemClock.uptimeMillis();
    }

    public final void f() {
        BubbleView bubbleView = this.b;
        if (bubbleView.getParent() == null) {
            this.e = SystemClock.uptimeMillis();
            this.a.addView(bubbleView);
            bubbleView.a(new rl((byte) 5), 100L);
            i7f i7fVar = this.c;
            g7f g7fVarC = u35.c(i7fVar, i7fVar);
            while (g7fVarC.hasNext()) {
                ((kz3) g7fVarC.next()).g(this);
            }
        }
    }
}
