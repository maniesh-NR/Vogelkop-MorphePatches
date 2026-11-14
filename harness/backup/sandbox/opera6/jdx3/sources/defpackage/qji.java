package defpackage;

import android.content.SharedPreferences;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.print.PageRange;
import android.print.PrintAttributes;
import android.print.PrintDocumentAdapter;
import android.text.TextUtils;
import com.leanplum.messagetemplates.MessageTemplateConstants;
import java.util.Locale;

/* loaded from: classes.dex */
public final class qji {
    public final Uri a;
    public final b59 d;
    public PrintAttributes e;
    public PrintAttributes f;
    public CancellationSignal g;
    public lji h;
    public mji i;
    public PrintDocumentAdapter j;
    public pji k;
    public String m;
    public boolean n;
    public long o;
    public PageRange[] p;
    public final oji b = new oji(this);
    public final h7f c = new h7f();
    public byte l = 0;

    /* JADX WARN: Multi-variable type inference failed */
    public qji(dx3 dx3Var, umi umiVar, b2l b2lVar) {
        d7l d7lVar = (d7l) b2lVar;
        this.a = Uri.parse(d7lVar.j.getUrl());
        String strL0 = d7lVar.l0();
        strL0 = TextUtils.isEmpty(strL0) ? d7lVar.k0() : strL0;
        this.m = TextUtils.isEmpty(strL0) ? dx3Var.getString(2132020554) : strL0;
        this.d = w1h.l(dx3Var, umiVar, "save_to_pdf", new bg1[0]);
    }

    public final void a() {
        this.i = null;
        this.h = null;
        this.f = null;
        CancellationSignal cancellationSignal = this.g;
        if (cancellationSignal != null) {
            cancellationSignal.cancel();
            this.g = null;
        }
        PrintDocumentAdapter printDocumentAdapter = this.j;
        if (printDocumentAdapter != null) {
            printDocumentAdapter.onFinish();
            this.j = null;
        }
        pji pjiVar = this.k;
        if (pjiVar == null) {
            return;
        }
        this.k = null;
        pjiVar.T();
    }

    public final void b() {
        a();
        f(0);
        h7f h7fVar = this.c;
        g7f g7fVarH = am2.h(h7fVar, h7fVar);
        while (g7fVarH.hasNext()) {
            ((nji) g7fVarH.next()).a();
        }
    }

    public final PrintAttributes c() {
        PrintAttributes.MediaSize mediaSize;
        PrintAttributes printAttributes = this.e;
        if (printAttributes != null) {
            return printAttributes;
        }
        SharedPreferences sharedPreferences = (SharedPreferences) this.d.get();
        PrintAttributes printAttributesBuild = null;
        String string = sharedPreferences.getString("media_size", null);
        if (string != null) {
            PrintAttributes.MediaSize[] mediaSizeArr = hrd.a;
            int length = mediaSizeArr.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    mediaSize = null;
                    break;
                }
                mediaSize = mediaSizeArr[i];
                if (mediaSize.getId().equals(string)) {
                    break;
                }
                i++;
            }
            if (mediaSize != null) {
                PrintAttributes.MediaSize mediaSizeAsPortrait = sharedPreferences.getBoolean("media_portrait", true) ? mediaSize.asPortrait() : mediaSize.asLandscape();
                if (mediaSizeAsPortrait != PrintAttributes.MediaSize.UNKNOWN_LANDSCAPE && mediaSizeAsPortrait != PrintAttributes.MediaSize.UNKNOWN_PORTRAIT) {
                    printAttributesBuild = new PrintAttributes.Builder().setMediaSize(mediaSizeAsPortrait).setResolution(new PrintAttributes.Resolution("PDF resolution", "PDF resolution", MessageTemplateConstants.Values.CENTER_POPUP_WIDTH, MessageTemplateConstants.Values.CENTER_POPUP_WIDTH)).setMinMargins(new PrintAttributes.Margins(sharedPreferences.getInt("margin_left", 0), sharedPreferences.getInt("margin_top", 0), sharedPreferences.getInt("margin_right", 0), sharedPreferences.getInt("margin_bottom", 0))).build();
                }
            }
        }
        this.e = printAttributesBuild;
        if (printAttributesBuild != null) {
            return printAttributesBuild;
        }
        Locale locale = Locale.getDefault();
        String lowerCase = locale.getCountry().toLowerCase(Locale.US);
        PrintAttributes.MediaSize mediaSize2 = ("ja".equals(sfe.b0(locale)) || "jp".equals(lowerCase)) ? PrintAttributes.MediaSize.JIS_B5 : ("us".equals(lowerCase) || "ca".equals(lowerCase)) ? PrintAttributes.MediaSize.NA_LETTER : PrintAttributes.MediaSize.ISO_A4;
        PrintAttributes.Builder resolution = new PrintAttributes.Builder().setMediaSize(mediaSize2).setResolution(new PrintAttributes.Resolution("PDF resolution", "PDF resolution", MessageTemplateConstants.Values.CENTER_POPUP_WIDTH, MessageTemplateConstants.Values.CENTER_POPUP_WIDTH));
        int i2 = mediaSize2.getWidthMils() < 1000 ? 0 : 394;
        int i3 = mediaSize2.getHeightMils() >= 1000 ? 394 : 0;
        PrintAttributes printAttributesBuild2 = resolution.setMinMargins(new PrintAttributes.Margins(i2, i3, i2, i3)).build();
        this.e = printAttributesBuild2;
        return printAttributesBuild2;
    }

    public final void d(CharSequence charSequence) {
        this.i = null;
        if (this.n) {
            this.n = false;
            g(this.e);
            return;
        }
        pji pjiVar = this.k;
        this.k = null;
        if (charSequence != null) {
            h7f h7fVar = this.c;
            g7f g7fVarH = am2.h(h7fVar, h7fVar);
            while (g7fVarH.hasNext()) {
                ((nji) g7fVarH.next()).b();
            }
        }
        f(2);
        if (pjiVar != null) {
            pjiVar.T();
        }
    }

    public final void e(nji njiVar) {
        this.c.c(njiVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void f(int i) {
        if (this.l != i) {
            this.l = i;
            h7f h7fVar = this.c;
            g7f g7fVarH = am2.h(h7fVar, h7fVar);
            while (g7fVarH.hasNext()) {
                ((nji) g7fVarH.next()).c(i);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [android.print.PrintDocumentAdapter$LayoutResultCallback, lji] */
    public final void g(PrintAttributes printAttributes) {
        f(1);
        ?? ljiVar = new lji(this, printAttributes);
        this.h = ljiVar;
        PrintDocumentAdapter printDocumentAdapter = this.j;
        PrintAttributes printAttributes2 = this.f;
        printDocumentAdapter.onLayout(printAttributes2 != null ? printAttributes2 : printAttributes, printAttributes, this.g, ljiVar, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v2, types: [android.print.PrintDocumentAdapter$WriteResultCallback, mji] */
    public final void h(ParcelFileDescriptor parcelFileDescriptor, PageRange[] pageRangeArr, pji pjiVar) {
        if (this.l != 2) {
            pjiVar.T();
            return;
        }
        this.k = pjiVar;
        f(3);
        ?? mjiVar = new mji(this, parcelFileDescriptor);
        this.i = mjiVar;
        this.j.onWrite(pageRangeArr, parcelFileDescriptor, this.g, mjiVar);
    }
}
