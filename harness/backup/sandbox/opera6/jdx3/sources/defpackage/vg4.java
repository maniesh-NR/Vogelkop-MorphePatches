package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.telephony.euicc.EuiccManager;
import com.leanplum.utils.SizeUtil;
import com.opera.android.OperaApplication;
import com.opera.android.startpage.livescore.LiveScoreCarouselStarButton;
import com.opera.android.tabui2.screenshots.TabScreenshotEntryDatabase;
import com.opera.hype.emoji.EmojiTextView;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.CountDownLatch;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final /* synthetic */ class vg4 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Context b;

    public /* synthetic */ vg4(Context context, byte b) {
        this.a = b;
        this.b = context;
    }

    public final Object invoke() throws IOException {
        byte b = this.a;
        int i = 0;
        Context context = this.b;
        switch (b) {
            case 0:
                return new f8i(context);
            case 1:
                return new yo6(context);
            case 2:
                return (EuiccManager) context.getSystemService("euicc");
            case 3:
                return new kz6(context);
            case 4:
                int i2 = EmojiTextView.i;
                return new fz7(context);
            case 5:
                CountDownLatch countDownLatch = oz7.a;
                return null;
            case 6:
                return Integer.valueOf(hv8.f.k(context));
            case 7:
                return Integer.valueOf(hv8.g.k(context));
            case 8:
                String[] strArr = OperaApplication.K;
                return Boolean.valueOf("google_play".equals(((OperaApplication) context.getApplicationContext()).l().a()));
            case h1a.ERROR_PRIVATE_FIELD_NUMBER /* 9 */:
                int i3 = LiveScoreCarouselStarButton.f;
                return j14.i0(2131232739, context);
            case h1a.INTENTS_REGULAR_FIELD_NUMBER /* 10 */:
                int i4 = LiveScoreCarouselStarButton.f;
                return Float.valueOf(z7h.h(context, 7.0f));
            case 11:
                int i5 = LiveScoreCarouselStarButton.f;
                return Float.valueOf(z7h.h(context, 2.0f));
            case 12:
                String strC = i0l.c(context);
                return strC != null ? strC : "";
            case 13:
                String strB = i0l.b(context);
                return strB != null ? strB : "";
            case 14:
                return cqp.f0(context);
            case 15:
                InputStream inputStreamOpen = context.getAssets().open("publicsuffixes");
                BufferedInputStream bufferedInputStream = inputStreamOpen instanceof BufferedInputStream ? (BufferedInputStream) inputStreamOpen : new BufferedInputStream(inputStreamOpen, 8192);
                try {
                    int iR = hn9.r(bufferedInputStream);
                    byte[] bArr = new byte[iR];
                    int i6 = 0;
                    while (i6 < iR) {
                        int i7 = bufferedInputStream.read(bArr, i6, iR - i6);
                        if (i7 == -1) {
                            throw new IOException("Unexpected end of stream");
                        }
                        i6 += i7;
                    }
                    int iR2 = hn9.r(bufferedInputStream);
                    byte[] bArr2 = new byte[iR2];
                    while (i < iR2) {
                        int i8 = bufferedInputStream.read(bArr2, i, iR2 - i);
                        if (i8 == -1) {
                            throw new IOException("Unexpected end of stream");
                        }
                        i += i8;
                    }
                    o9h o9hVar = new o9h(bArr, bArr2);
                    bufferedInputStream.close();
                    return o9hVar;
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        vtp.v(bufferedInputStream, th);
                        throw th2;
                    }
                }
            case 16:
                return cqp.f0(context);
            case 17:
                Drawable drawableF = sgb.F(2131232250, context);
                j14.n0(drawableF, f03.t(2130969288, context, 2131101243));
                int iA = fan.a(16.0f, context.getResources());
                drawableF.setBounds(0, 0, iA, iA);
                return drawableF;
            case SizeUtil.textSize0_1 /* 18 */:
                Drawable drawableF2 = sgb.F(2131232197, context);
                if (drawableF2 == null) {
                    qp2.n("Required value was null.");
                    return null;
                }
                j14.n0(drawableF2, f03.t(2130969288, context, 2131101243));
                int iA2 = fan.a(16.0f, context.getResources());
                drawableF2.setBounds(0, 0, iA2, iA2);
                return drawableF2;
            default:
                u5i u5iVarF = xih.f(context, TabScreenshotEntryDatabase.class, "tab_screenshots");
                u5iVarF.a(new ryd[]{n7l.e});
                return (TabScreenshotEntryDatabase) u5iVarF.b();
        }
    }
}
