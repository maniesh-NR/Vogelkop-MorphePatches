package defpackage;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.provider.Settings;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.widget.EditText;
import android.widget.TextView;
import com.google.android.material.textfield.TextInputLayout;
import com.opera.android.BrowserActivity;
import com.opera.android.OperaApplication;

/* loaded from: classes.dex */
public final class wpe extends nz0 {
    public final /* synthetic */ byte a = 0;
    public final Object b;
    public final Object c;

    public wpe(String str, String str2) {
        super(true, false);
        this.c = str;
        this.b = str2;
    }

    public wpe(String str, lag lagVar) {
        super(false, false);
        this.b = str;
        this.c = lagVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wpe(kxe kxeVar, BrowserActivity browserActivity) {
        super(false, false);
        this.b = browserActivity;
        this.c = kxeVar;
    }

    @Override // defpackage.nz0
    public final String getNegativeButtonText(Context context) {
        switch (this.a) {
            case 0:
                return context.getString(2132018111);
            case 1:
                return context.getString(2132018111);
            default:
                return context.getString(2132018541);
        }
    }

    @Override // defpackage.nz0
    public final String getPositiveButtonText(Context context) {
        switch (this.a) {
            case 0:
                return context.getString(2132020155);
            case 1:
                return context.getString(2132020027);
            default:
                return context.getString(2132017536);
        }
    }

    @Override // defpackage.nz0
    public final void onCreateDialog(az0 az0Var) {
        byte b = this.a;
        Object obj = this.c;
        switch (b) {
            case 0:
                wy0 wy0Var = az0Var.a;
                wy0Var.r = null;
                wy0Var.q = 2131558664;
                az0Var.b(2132017371);
                break;
            case 1:
                az0Var.b(2132020437);
                kxe kxeVar = (kxe) obj;
                az0Var.a.f = kxeVar.getString(2132021285, new Object[]{kxeVar.getString(2132017591)});
                break;
            default:
                int iOrdinal = ((lag) obj).ordinal();
                int i = iOrdinal != 2 ? iOrdinal != 3 ? 0 : 2132020582 : 2132019206;
                Context context = az0Var.getContext();
                az0 title = az0Var.setTitle(context.getString(i));
                String string = context.getString(2132020433, (String) this.b);
                wy0 wy0Var2 = title.a;
                wy0Var2.f = string;
                wy0Var2.k = true;
                break;
        }
    }

    @Override // defpackage.d63
    public final void onFinished(hjm hjmVar) {
        switch (this.a) {
            case 1:
                if (hjmVar == hjm.b) {
                    ((kxe) this.c).L = false;
                    break;
                }
                break;
            default:
                super.onFinished(hjmVar);
                break;
        }
    }

    @Override // defpackage.nz0
    public final void onNegativeButtonClicked(bz0 bz0Var) {
        byte b = this.a;
        Object obj = this.c;
        switch (b) {
            case 1:
                ((kxe) obj).L = false;
                break;
            case 2:
                s9g.h.o(false, (String) this.b, (lag) obj, kag.DENIED, true);
                break;
            default:
                super.onNegativeButtonClicked(bz0Var);
                break;
        }
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [android.content.Context, com.opera.android.BrowserActivity, hjf, java.lang.Object] */
    @Override // defpackage.nz0
    public final void onPositiveButtonClicked(bz0 bz0Var) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                EditText editText = (EditText) bz0Var.findViewById(2131362658);
                Context context = bz0Var.getContext();
                String[] strArr = OperaApplication.K;
                q6e q6eVarI = ((OperaApplication) context.getApplicationContext()).I();
                String str = (String) obj;
                q6eVarI.p.s(str, new yo7(q6eVarI, str, editText.getText().toString(), (byte) 17));
                break;
            case 1:
                ?? r1 = (BrowserActivity) obj;
                y0a y0aVar = new y0a(this, (byte) 28);
                if (Settings.canDrawOverlays(r1)) {
                    y0aVar.run(Boolean.TRUE);
                    break;
                } else {
                    try {
                        r1.D(new Intent("android.settings.action.MANAGE_OVERLAY_PERMISSION", Uri.parse("package:" + r1.getPackageName())), new g2b((Object) r1, (Object) y0aVar, (byte) 2));
                        break;
                    } catch (ActivityNotFoundException unused) {
                        y0aVar.run(Boolean.FALSE);
                        return;
                    }
                }
            default:
                s9g.h.o(false, (String) obj, (lag) this.c, kag.GRANTED, true);
                break;
        }
    }

    @Override // defpackage.nz0
    public final void onShowDialog(final bz0 bz0Var) {
        switch (this.a) {
            case 0:
                TextInputLayout textInputLayoutFindViewById = bz0Var.findViewById(2131363222);
                textInputLayoutFindViewById.t(bz0Var.getContext().getString(2132017374));
                final EditText editText = textInputLayoutFindViewById.e;
                editText.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: vpe
                    @Override // android.widget.TextView.OnEditorActionListener
                    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                        if (i != 6 && !oup.g0(keyEvent)) {
                            return false;
                        }
                        if (TextUtils.isEmpty(editText.getText())) {
                            return true;
                        }
                        wpe wpeVar = this.a;
                        bz0 bz0Var2 = bz0Var;
                        wpeVar.onPositiveButtonClicked(bz0Var2);
                        bz0Var2.dismiss();
                        return true;
                    }
                });
                editText.addTextChangedListener(new lv(this, bz0Var, (byte) 1));
                editText.setText((String) this.c);
                break;
            default:
                super.onShowDialog(bz0Var);
                break;
        }
    }
}
