package defpackage;

import android.content.res.Resources;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.print.PrintAttributes;
import android.print.PrintDocumentAdapter;
import android.print.PrintDocumentInfo;
import org.chromium.printing.Printable;

/* loaded from: classes.dex */
public final class fyg extends PrintDocumentAdapter {
    public final jyg a;

    public fyg(jyg jygVar) {
        this.a = jygVar;
    }

    @Override // android.print.PrintDocumentAdapter
    public final void onFinish() throws Resources.NotFoundException {
        super.onFinish();
        jyg jygVar = this.a;
        jygVar.i = null;
        jygVar.b();
    }

    @Override // android.print.PrintDocumentAdapter
    public final void onLayout(PrintAttributes printAttributes, PrintAttributes printAttributes2, CancellationSignal cancellationSignal, PrintDocumentAdapter.LayoutResultCallback layoutResultCallback, Bundle bundle) {
        PrintDocumentAdapter.LayoutResultCallback layoutResultCallback2 = (PrintDocumentAdapter.LayoutResultCallback) new i4d(layoutResultCallback, (byte) 18).b;
        jyg jygVar = this.a;
        String str = jygVar.a;
        if (jygVar.p) {
            layoutResultCallback2.onLayoutFailed(str);
            return;
        }
        jygVar.e = printAttributes2.getResolution().getHorizontalDpi();
        jygVar.f = printAttributes2.getMediaSize();
        jygVar.g = jygVar.m ? printAttributes2.getMinMargins() : null;
        if (jygVar.k == 1) {
            layoutResultCallback2.onLayoutFailed(str);
        } else {
            layoutResultCallback2.onLayoutFinished(new PrintDocumentInfo.Builder(jygVar.j.getTitle()).setContentType(0).setPageCount(-1).build(), true);
        }
    }

    @Override // android.print.PrintDocumentAdapter
    public final void onStart() {
        Printable printable;
        jyg jygVar = this.a;
        if (jygVar.p) {
            return;
        }
        jygVar.k = (byte) 0;
        if (jygVar.n || (printable = jygVar.j) == null || !printable.b()) {
            return;
        }
        jygVar.j.getClass();
        jygVar.j.getClass();
        jygVar.n = false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:34:0x008b A[PHI: r9
      0x008b: PHI (r9v7 android.os.ParcelFileDescriptor) = (r9v14 android.os.ParcelFileDescriptor), (r9v15 android.os.ParcelFileDescriptor) binds: [B:30:0x007c, B:32:0x0086] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Type inference failed for: r9v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r9v5, types: [java.util.Iterator] */
    /* JADX WARN: Type inference failed for: r9v6 */
    @Override // android.print.PrintDocumentAdapter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onWrite(android.print.PageRange[] r8, android.os.ParcelFileDescriptor r9, android.os.CancellationSignal r10, android.print.PrintDocumentAdapter.WriteResultCallback r11) throws java.io.IOException {
        /*
            r7 = this;
            lld r10 = new lld
            r0 = 14
            r10.<init>(r11, r0)
            jyg r7 = r7.a
            java.lang.String r11 = r7.a
            java.lang.String r0 = "ParcelFileDescriptor.dup() failed: "
            boolean r1 = r7.p
            if (r1 == 0) goto L19
            r10.k0(r11)
            r9.close()     // Catch: java.io.IOException -> Lbd
            goto Lbd
        L19:
            r1 = 0
            if (r8 == 0) goto Lb7
            int r2 = r8.length
            if (r2 == 0) goto Lb7
            r7.i = r10
            android.os.ParcelFileDescriptor r10 = r9.dup()     // Catch: java.io.IOException -> L96 java.lang.Throwable -> Lb2
            r7.d = r10     // Catch: java.io.IOException -> L96 java.lang.Throwable -> Lb2
            r9.close()     // Catch: java.io.IOException -> L2a
        L2a:
            int r9 = r8.length
            r10 = 1
            r0 = 0
            if (r9 != r10) goto L3b
            r9 = r8[r0]
            android.print.PageRange r2 = android.print.PageRange.ALL_PAGES
            boolean r9 = r9.equals(r2)
            if (r9 == 0) goto L3b
            r2 = r1
            goto L78
        L3b:
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            int r2 = r8.length
            r3 = r0
        L42:
            if (r3 >= r2) goto L5d
            r4 = r8[r3]
            int r5 = r4.getStart()
        L4a:
            int r6 = r4.getEnd()
            if (r5 > r6) goto L5a
            java.lang.Integer r6 = java.lang.Integer.valueOf(r5)
            r9.add(r6)
            int r5 = r5 + 1
            goto L4a
        L5a:
            int r3 = r3 + 1
            goto L42
        L5d:
            int r8 = r9.size()
            int[] r2 = new int[r8]
            java.util.Iterator r9 = r9.iterator()
        L67:
            if (r0 >= r8) goto L78
            java.lang.Object r3 = r9.next()
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            r2[r0] = r3
            int r0 = r0 + 1
            goto L67
        L78:
            r7.h = r2
            org.chromium.printing.Printable r8 = r7.j
            if (r8 == 0) goto L8b
            int r9 = r7.b
            int r0 = r7.c
            boolean r8 = r8.j(r9, r0)
            if (r8 == 0) goto L8b
            r7.k = r10
            goto Lbd
        L8b:
            r7.a()
            lld r8 = r7.i
            r8.k0(r11)
            r7.i = r1
            goto Lbd
        L96:
            r8 = move-exception
            lld r10 = r7.i     // Catch: java.lang.Throwable -> Lb2
            java.lang.String r8 = r8.toString()     // Catch: java.lang.Throwable -> Lb2
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lb2
            r11.<init>(r0)     // Catch: java.lang.Throwable -> Lb2
            r11.append(r8)     // Catch: java.lang.Throwable -> Lb2
            java.lang.String r8 = r11.toString()     // Catch: java.lang.Throwable -> Lb2
            r10.k0(r8)     // Catch: java.lang.Throwable -> Lb2
            r7.i = r1     // Catch: java.lang.Throwable -> Lb2
            r9.close()     // Catch: java.io.IOException -> Lbd
            goto Lbd
        Lb2:
            r7 = move-exception
            r9.close()     // Catch: java.io.IOException -> Lb6
        Lb6:
            throw r7
        Lb7:
            r10.k0(r1)
            r9.close()     // Catch: java.io.IOException -> Lbd
        Lbd:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fyg.onWrite(android.print.PageRange[], android.os.ParcelFileDescriptor, android.os.CancellationSignal, android.print.PrintDocumentAdapter$WriteResultCallback):void");
    }
}
