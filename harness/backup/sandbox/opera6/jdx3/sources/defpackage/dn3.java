package defpackage;

import android.view.View;
import androidx.fragment.app.w;
import com.google.android.material.button.MaterialButton;
import com.opera.android.ui.catalog.widget.OperaIconedMessage;
import java.util.Objects;

/* loaded from: classes.dex */
public final class dn3 extends e7n {
    public final /* synthetic */ gn3 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dn3(gn3 gn3Var, View view, tzi tziVar, byte b) {
        super(view, tziVar);
        final byte b2 = 1;
        final byte b3 = 0;
        switch (b) {
            case 1:
                Objects.requireNonNull(gn3Var);
                this.k = gn3Var;
                super(view, tziVar);
                OperaIconedMessage operaIconedMessage = lwk.a(view).b;
                ((MaterialButton) operaIconedMessage.a.f).setOnClickListener(new View.OnClickListener(this) { // from class: en3
                    public final /* synthetic */ dn3 b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        byte b4 = b3;
                        dn3 dn3Var = this.b;
                        switch (b4) {
                            case 0:
                                xgh.a = true;
                                dn3Var.k.s.K(dn3Var.i);
                                break;
                            default:
                                xih.y(view2.getContext(), dn3Var.k.h, new fv2(dn3Var, (byte) 14), null);
                                break;
                        }
                    }
                });
                operaIconedMessage.b(new View.OnClickListener(this) { // from class: en3
                    public final /* synthetic */ dn3 b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        byte b4 = b2;
                        dn3 dn3Var = this.b;
                        switch (b4) {
                            case 0:
                                xgh.a = true;
                                dn3Var.k.s.K(dn3Var.i);
                                break;
                            default:
                                xih.y(view2.getContext(), dn3Var.k.h, new fv2(dn3Var, (byte) 14), null);
                                break;
                        }
                    }
                });
                break;
            default:
                Objects.requireNonNull(gn3Var);
                this.k = gn3Var;
                OperaIconedMessage operaIconedMessage2 = (OperaIconedMessage) view;
                ((MaterialButton) operaIconedMessage2.a.f).setOnClickListener(new View.OnClickListener(this) { // from class: cn3
                    public final /* synthetic */ dn3 b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        byte b4 = b3;
                        dn3 dn3Var = this.b;
                        switch (b4) {
                            case 0:
                                gn3 gn3Var2 = dn3Var.k;
                                gn3Var2.H.j = true;
                                gn3Var2.s.K(dn3Var.i);
                                break;
                            default:
                                gn3 gn3Var3 = dn3Var.k;
                                w parentFragmentManager = ((im3) gn3Var3.v.b).getParentFragmentManager();
                                if (parentFragmentManager != null) {
                                    xih.w(parentFragmentManager, gn3Var3.i, new fv2(dn3Var, (byte) 13), true);
                                    break;
                                }
                                break;
                        }
                    }
                });
                operaIconedMessage2.b(new View.OnClickListener(this) { // from class: cn3
                    public final /* synthetic */ dn3 b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        byte b4 = b2;
                        dn3 dn3Var = this.b;
                        switch (b4) {
                            case 0:
                                gn3 gn3Var2 = dn3Var.k;
                                gn3Var2.H.j = true;
                                gn3Var2.s.K(dn3Var.i);
                                break;
                            default:
                                gn3 gn3Var3 = dn3Var.k;
                                w parentFragmentManager = ((im3) gn3Var3.v.b).getParentFragmentManager();
                                if (parentFragmentManager != null) {
                                    xih.w(parentFragmentManager, gn3Var3.i, new fv2(dn3Var, (byte) 13), true);
                                    break;
                                }
                                break;
                        }
                    }
                });
                break;
        }
    }
}
