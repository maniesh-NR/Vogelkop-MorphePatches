package org.chromium.printing;

import J.N;
import android.app.Activity;
import android.content.res.Resources;
import android.os.ParcelFileDescriptor;
import android.print.PageRange;
import android.print.PrintAttributes;
import android.print.PrintDocumentAdapter;
import defpackage.jyg;
import defpackage.lyg;
import defpackage.pjg;
import java.io.IOException;
import org.chromium.ui.base.WindowAndroid;

/* loaded from: classes.dex */
public final class PrintingContext {
    public final lyg a;
    public final long b;

    public PrintingContext(long j, WindowAndroid windowAndroid) {
        this.a = lyg.c(windowAndroid);
        this.b = j;
    }

    public static PrintingContext create(long j, WindowAndroid windowAndroid) {
        return new PrintingContext(j, windowAndroid);
    }

    public static void pdfWritingDone(int i, WindowAndroid windowAndroid) {
        PageRange[] pageRangeArr;
        jyg jygVar = lyg.c(windowAndroid).b;
        if (jygVar == null || jygVar.p || jygVar.k != 1) {
            return;
        }
        jygVar.k = (byte) 0;
        jygVar.a();
        if (i <= 0) {
            jygVar.i.k0(jygVar.a);
            jygVar.i = null;
            return;
        }
        int[] iArr = jygVar.h;
        if (iArr != null) {
            int iMin = Math.min(iArr.length, i);
            pageRangeArr = new PageRange[iMin];
            for (int i2 = 0; i2 < iMin; i2++) {
                int i3 = iArr[i2];
                pageRangeArr[i2] = new PageRange(i3, i3);
            }
        } else {
            pageRangeArr = new PageRange[]{new PageRange(0, i - 1)};
        }
        ((PrintDocumentAdapter.WriteResultCallback) jygVar.i.b).onWriteFinished(pageRangeArr);
        jygVar.i = null;
    }

    public static void setPendingPrint(WindowAndroid windowAndroid, Printable printable, int i, int i2) throws Resources.NotFoundException {
        Activity activity = (Activity) windowAndroid.m().get();
        if (activity == null || activity.isFinishing() || activity.isDestroyed()) {
            return;
        }
        lyg.c(windowAndroid).f(printable, new z8b(activity), i, i2);
    }

    public final void askUserForSettings(int i) {
        jyg jygVar = this.a.b;
        N.M8HtOhJl(this.b, !(jygVar != null && jygVar.k == 2));
    }

    public final int getBottomMargin() {
        PrintAttributes.Margins margins;
        jyg jygVar = this.a.b;
        if (jygVar == null || (margins = jygVar.g) == null) {
            return 0;
        }
        return margins.getBottomMils();
    }

    public final int getDpi() {
        jyg jygVar = this.a.b;
        if (jygVar != null) {
            return jygVar.e;
        }
        return 0;
    }

    public final int getHeight() {
        PrintAttributes.MediaSize mediaSize;
        jyg jygVar = this.a.b;
        if (jygVar == null || (mediaSize = jygVar.f) == null) {
            return 0;
        }
        return mediaSize.getHeightMils();
    }

    public final int getLeftMargin() {
        PrintAttributes.Margins margins;
        jyg jygVar = this.a.b;
        if (jygVar == null || (margins = jygVar.g) == null) {
            return 0;
        }
        return margins.getLeftMils();
    }

    public final int[] getPages() {
        int[] iArr;
        jyg jygVar = this.a.b;
        if (jygVar == null || (iArr = jygVar.h) == null) {
            return null;
        }
        return (int[]) iArr.clone();
    }

    public final int getRightMargin() {
        PrintAttributes.Margins margins;
        jyg jygVar = this.a.b;
        if (jygVar == null || (margins = jygVar.g) == null) {
            return 0;
        }
        return margins.getRightMils();
    }

    public final int getTopMargin() {
        PrintAttributes.Margins margins;
        jyg jygVar = this.a.b;
        if (jygVar == null || (margins = jygVar.g) == null) {
            return 0;
        }
        return margins.getTopMils();
    }

    public final int getWidth() {
        PrintAttributes.MediaSize mediaSize;
        jyg jygVar = this.a.b;
        if (jygVar == null || (mediaSize = jygVar.f) == null) {
            return 0;
        }
        return mediaSize.getWidthMils();
    }

    public final void showPrintDialog() throws Resources.NotFoundException {
        lyg lygVar = this.a;
        if (lygVar.d()) {
            N.Mmq2M8tt(this.b);
            return;
        }
        pjg pjgVar = new pjg(this, (byte) 9);
        jyg jygVar = lygVar.b;
        if (jygVar == null || jygVar.k == 2) {
            lygVar.c = pjgVar;
        } else {
            jygVar.l = pjgVar;
        }
        lygVar.g();
    }

    public final int takeDuplicatedFileDescriptor() {
        jyg jygVar = this.a.b;
        ParcelFileDescriptor parcelFileDescriptor = jygVar != null ? jygVar.d : null;
        if (parcelFileDescriptor == null) {
            return -1;
        }
        try {
            return parcelFileDescriptor.dup().detachFd();
        } catch (IOException unused) {
            return -1;
        }
    }

    public final boolean useCustomMargins() {
        jyg jygVar = this.a.b;
        return (jygVar == null || jygVar.g == null) ? false : true;
    }
}
