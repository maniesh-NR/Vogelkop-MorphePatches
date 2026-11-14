package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import com.leanplum.utils.SizeUtil;
import com.opera.android.BrowserActivity;
import com.opera.android.Lazy;
import com.opera.android.autofill.OperaAutofillService;
import com.opera.android.autofill.passwords.picker.AutofillPasswordPickerActivity;
import com.opera.android.widget.UrlFieldEditText;
import java.io.File;
import okhttp3.internal._UtilJvmKt;

/* loaded from: classes.dex */
public final /* synthetic */ class vx implements esk {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ vx(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public final Object get() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                cy cyVar = (cy) ((vzk) obj).a;
                if (((ay) cyVar.b).c()) {
                    return cyVar.c().a;
                }
                return null;
            case 1:
                return new iy0((jy0) obj);
            case 2:
                return m5h.k(((at1) obj).j.a);
            case 3:
                return m5h.k(((ht1) obj).e.a);
            case 4:
                return m5h.k(((it1) obj).a);
            case 5:
                return (d75) ((c75) obj).i();
            case 6:
                return ((e00) obj).b().a;
            case 7:
                return Boolean.valueOf(wxe.J(((b22) obj).v));
            case 8:
                return Boolean.valueOf(wxe.J(((t42) obj).v));
            case h1a.ERROR_PRIVATE_FIELD_NUMBER /* 9 */:
                return z5i.m0(16.0f / Math.max(r5.getWidth(), r5.getHeight()), (Bitmap) obj);
            case h1a.INTENTS_REGULAR_FIELD_NUMBER /* 10 */:
                AutofillPasswordPickerActivity autofillPasswordPickerActivity = (AutofillPasswordPickerActivity) obj;
                int i = AutofillPasswordPickerActivity.o;
                return autofillPasswordPickerActivity;
            case 11:
                return (dpf) ((ekc) obj).g();
            case 12:
                return (lj3) ((si3) obj).n.getValue();
            case 13:
                return ((im3) obj).getParentFragmentManager();
            case 14:
                int i2 = BrowserActivity.E1;
                return Boolean.valueOf(((z43) obj).n());
            case 15:
                return Boolean.valueOf(((t5d) obj).d0());
            case 16:
                return new File(((Context) ((ki) obj).b).getFilesDir(), "ai_prompts");
            case 17:
                s9f s9fVarB = ((t9f) ((ii) ((br6) obj).e).get()).b();
                on7 on7Var = pn7.b;
                un7 un7Var = un7.e;
                s9fVarB.y = _UtilJvmKt.checkDuration-HG0u8IE("duration", cs5.x0(30, un7Var));
                s9fVarB.z = _UtilJvmKt.checkDuration-HG0u8IE("duration", cs5.x0(30, un7Var));
                return new t9f(s9fVarB);
            case SizeUtil.textSize0_1 /* 18 */:
                return ((wg7) obj).M0();
            case 19:
                return Boolean.valueOf(!q9n.x(((xw8) obj).o.c));
            case SizeUtil.textSize0 /* 20 */:
                return ((Lazy) obj).get();
            case 21:
                return ((b59) obj).get();
            case SizeUtil.textSize1 /* 22 */:
                tjc tjcVar = (tjc) obj;
                return new c36(tjcVar.c, tjcVar.a);
            case 23:
                return (sqc) ((zqc) obj).o.getValue();
            case SizeUtil.textSize2 /* 24 */:
                return ((rld) obj).requireActivity().getWindow();
            case 25:
                c3j c3jVarD = ((d3j) e3j.t(((fqe) obj).a).i()).d(4, false);
                return new i4d((Object) new Uri.Builder().scheme("https").authority(c3jVarD != null ? (String) c3jVarD.d : "news.opera-api.com").build(), (byte) 6);
            case 26:
                mhb mhbVar = (mhb) obj;
                return ((yxe) mhbVar.d).a.a.l((az) mhbVar.c);
            case 27:
                return Integer.valueOf(((UrlFieldEditText) obj).getHighlightColor());
            case 28:
                return (bef) ((cq5) obj).getValue();
            default:
                int i3 = OperaAutofillService.d;
                return new rye(((OperaAutofillService) obj).getApplicationContext());
        }
    }
}
