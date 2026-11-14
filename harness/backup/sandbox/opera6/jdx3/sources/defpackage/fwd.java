package defpackage;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.opera.android.custom_views.LayoutDirectionFrameLayout;
import com.opera.android.custom_views.StylingTextView;

/* loaded from: classes.dex */
public final class fwd extends dwd {
    public final /* synthetic */ byte g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fwd(mej mejVar, hb9 hb9Var, byte b) {
        super(mejVar, hb9Var);
        this.g = b;
    }

    @Override // defpackage.dej
    public final View a(Context context) {
        switch (this.g) {
            case 0:
                vs vsVarD = vs.d(LayoutInflater.from(context));
                g((FrameLayout) vsVarD.c, (LinearLayout) vsVarD.d);
                ((StylingTextView) vsVarD.e).setText(((kb9) this.d).e);
                final byte b = 0;
                d(2132018423, 2131232051, new Runnable(this) { // from class: ewd
                    public final /* synthetic */ fwd b;

                    {
                        this.b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        byte b2 = b;
                        fwd fwdVar = this.b;
                        switch (b2) {
                            case 0:
                                ClipboardManager clipboardManager = (ClipboardManager) fwdVar.b.getContext().getSystemService("clipboard");
                                if (clipboardManager != null) {
                                    String str = ((kb9) fwdVar.d).e;
                                    clipboardManager.setPrimaryClip(ClipData.newPlainText(str, str));
                                    break;
                                }
                                break;
                            default:
                                new ghf(new i4d(new u5f(((kb9) fwdVar.d).e, (byte) 11))).I(fwdVar.b.getContext());
                                break;
                        }
                    }
                });
                final byte b2 = 1;
                d(2132018440, 2131232244, new Runnable(this) { // from class: ewd
                    public final /* synthetic */ fwd b;

                    {
                        this.b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        byte b22 = b2;
                        fwd fwdVar = this.b;
                        switch (b22) {
                            case 0:
                                ClipboardManager clipboardManager = (ClipboardManager) fwdVar.b.getContext().getSystemService("clipboard");
                                if (clipboardManager != null) {
                                    String str = ((kb9) fwdVar.d).e;
                                    clipboardManager.setPrimaryClip(ClipData.newPlainText(str, str));
                                    break;
                                }
                                break;
                            default:
                                new ghf(new i4d(new u5f(((kb9) fwdVar.d).e, (byte) 11))).I(fwdVar.b.getContext());
                                break;
                        }
                    }
                });
                e();
                return (LayoutDirectionFrameLayout) vsVarD.b;
            default:
                vs vsVarD2 = vs.d(LayoutInflater.from(context));
                g((FrameLayout) vsVarD2.c, (LinearLayout) vsVarD2.d);
                ((StylingTextView) vsVarD2.e).setText(2132019081);
                e();
                return (LayoutDirectionFrameLayout) vsVarD2.b;
        }
    }
}
