package com.opera.hype.image.editor;

import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.a;
import androidx.fragment.app.w;
import com.opera.hype.image.editor.ImageEditorActivity;
import defpackage.axa;
import defpackage.luf;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/opera/hype/image/editor/ImageEditorActivity;", "Lfp1;", "<init>", "()V", "image-editor"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes.dex */
public class ImageEditorActivity extends fp1 {
    public static final Bitmap.CompressFormat d = Bitmap.CompressFormat.PNG;
    public final zyk a;
    public final zyk b;
    public final zyk c;

    public ImageEditorActivity() {
        final byte b = 0;
        this.a = z4c.b(new Function0(this) { // from class: pwa
            public final /* synthetic */ ImageEditorActivity b;

            {
                this.b = this;
            }

            /* JADX WARN: Type inference failed for: r5v1, types: [android.app.Activity, android.content.Context, com.opera.hype.image.editor.ImageEditorActivity] */
            public final Object invoke() {
                ArrayList parcelableArrayListExtra;
                Uri uri;
                byte b2 = b;
                ArrayList arrayList = null;
                ?? r5 = this.b;
                switch (b2) {
                    case 0:
                        Bitmap.CompressFormat compressFormat = ImageEditorActivity.d;
                        Intent intent = r5.getIntent();
                        if (intent != null && (parcelableArrayListExtra = intent.getParcelableArrayListExtra("tools")) != null && !parcelableArrayListExtra.isEmpty()) {
                            arrayList = parcelableArrayListExtra;
                        }
                        if (arrayList == null) {
                            nsl.d.getClass();
                            nsl[] nslVarArrValues = nsl.values();
                            arrayList = new ArrayList();
                            for (nsl nslVar : nslVarArrValues) {
                                if (nslVar.c) {
                                    arrayList.add(nslVar);
                                }
                            }
                        }
                        return arrayList;
                    case 1:
                        Bitmap.CompressFormat compressFormat2 = ImageEditorActivity.d;
                        Intent intent2 = r5.getIntent();
                        return (intent2 == null || (uri = (Uri) ((Parcelable) yi4.x(intent2, "input-uri", Uri.class))) == null) ? Uri.EMPTY : uri;
                    case 2:
                        Bitmap.CompressFormat compressFormat3 = ImageEditorActivity.d;
                        Intent intent3 = r5.getIntent();
                        if (intent3 != null) {
                            return (Uri) ((Parcelable) yi4.x(intent3, "output", Uri.class));
                        }
                        return null;
                    case 3:
                        Bitmap.CompressFormat compressFormat4 = ImageEditorActivity.d;
                        return r5.s();
                    default:
                        Bitmap.CompressFormat compressFormat5 = ImageEditorActivity.d;
                        return new ra5(r5.getApplicationContext());
                }
            }
        });
        final byte b2 = 1;
        this.b = z4c.b(new Function0(this) { // from class: pwa
            public final /* synthetic */ ImageEditorActivity b;

            {
                this.b = this;
            }

            /* JADX WARN: Type inference failed for: r5v1, types: [android.app.Activity, android.content.Context, com.opera.hype.image.editor.ImageEditorActivity] */
            public final Object invoke() {
                ArrayList parcelableArrayListExtra;
                Uri uri;
                byte b22 = b2;
                ArrayList arrayList = null;
                ?? r5 = this.b;
                switch (b22) {
                    case 0:
                        Bitmap.CompressFormat compressFormat = ImageEditorActivity.d;
                        Intent intent = r5.getIntent();
                        if (intent != null && (parcelableArrayListExtra = intent.getParcelableArrayListExtra("tools")) != null && !parcelableArrayListExtra.isEmpty()) {
                            arrayList = parcelableArrayListExtra;
                        }
                        if (arrayList == null) {
                            nsl.d.getClass();
                            nsl[] nslVarArrValues = nsl.values();
                            arrayList = new ArrayList();
                            for (nsl nslVar : nslVarArrValues) {
                                if (nslVar.c) {
                                    arrayList.add(nslVar);
                                }
                            }
                        }
                        return arrayList;
                    case 1:
                        Bitmap.CompressFormat compressFormat2 = ImageEditorActivity.d;
                        Intent intent2 = r5.getIntent();
                        return (intent2 == null || (uri = (Uri) ((Parcelable) yi4.x(intent2, "input-uri", Uri.class))) == null) ? Uri.EMPTY : uri;
                    case 2:
                        Bitmap.CompressFormat compressFormat3 = ImageEditorActivity.d;
                        Intent intent3 = r5.getIntent();
                        if (intent3 != null) {
                            return (Uri) ((Parcelable) yi4.x(intent3, "output", Uri.class));
                        }
                        return null;
                    case 3:
                        Bitmap.CompressFormat compressFormat4 = ImageEditorActivity.d;
                        return r5.s();
                    default:
                        Bitmap.CompressFormat compressFormat5 = ImageEditorActivity.d;
                        return new ra5(r5.getApplicationContext());
                }
            }
        });
        final byte b3 = 2;
        z4c.b(new Function0(this) { // from class: pwa
            public final /* synthetic */ ImageEditorActivity b;

            {
                this.b = this;
            }

            /* JADX WARN: Type inference failed for: r5v1, types: [android.app.Activity, android.content.Context, com.opera.hype.image.editor.ImageEditorActivity] */
            public final Object invoke() {
                ArrayList parcelableArrayListExtra;
                Uri uri;
                byte b22 = b3;
                ArrayList arrayList = null;
                ?? r5 = this.b;
                switch (b22) {
                    case 0:
                        Bitmap.CompressFormat compressFormat = ImageEditorActivity.d;
                        Intent intent = r5.getIntent();
                        if (intent != null && (parcelableArrayListExtra = intent.getParcelableArrayListExtra("tools")) != null && !parcelableArrayListExtra.isEmpty()) {
                            arrayList = parcelableArrayListExtra;
                        }
                        if (arrayList == null) {
                            nsl.d.getClass();
                            nsl[] nslVarArrValues = nsl.values();
                            arrayList = new ArrayList();
                            for (nsl nslVar : nslVarArrValues) {
                                if (nslVar.c) {
                                    arrayList.add(nslVar);
                                }
                            }
                        }
                        return arrayList;
                    case 1:
                        Bitmap.CompressFormat compressFormat2 = ImageEditorActivity.d;
                        Intent intent2 = r5.getIntent();
                        return (intent2 == null || (uri = (Uri) ((Parcelable) yi4.x(intent2, "input-uri", Uri.class))) == null) ? Uri.EMPTY : uri;
                    case 2:
                        Bitmap.CompressFormat compressFormat3 = ImageEditorActivity.d;
                        Intent intent3 = r5.getIntent();
                        if (intent3 != null) {
                            return (Uri) ((Parcelable) yi4.x(intent3, "output", Uri.class));
                        }
                        return null;
                    case 3:
                        Bitmap.CompressFormat compressFormat4 = ImageEditorActivity.d;
                        return r5.s();
                    default:
                        Bitmap.CompressFormat compressFormat5 = ImageEditorActivity.d;
                        return new ra5(r5.getApplicationContext());
                }
            }
        });
        final byte b4 = 3;
        z4c.b(new Function0(this) { // from class: pwa
            public final /* synthetic */ ImageEditorActivity b;

            {
                this.b = this;
            }

            /* JADX WARN: Type inference failed for: r5v1, types: [android.app.Activity, android.content.Context, com.opera.hype.image.editor.ImageEditorActivity] */
            public final Object invoke() {
                ArrayList parcelableArrayListExtra;
                Uri uri;
                byte b22 = b4;
                ArrayList arrayList = null;
                ?? r5 = this.b;
                switch (b22) {
                    case 0:
                        Bitmap.CompressFormat compressFormat = ImageEditorActivity.d;
                        Intent intent = r5.getIntent();
                        if (intent != null && (parcelableArrayListExtra = intent.getParcelableArrayListExtra("tools")) != null && !parcelableArrayListExtra.isEmpty()) {
                            arrayList = parcelableArrayListExtra;
                        }
                        if (arrayList == null) {
                            nsl.d.getClass();
                            nsl[] nslVarArrValues = nsl.values();
                            arrayList = new ArrayList();
                            for (nsl nslVar : nslVarArrValues) {
                                if (nslVar.c) {
                                    arrayList.add(nslVar);
                                }
                            }
                        }
                        return arrayList;
                    case 1:
                        Bitmap.CompressFormat compressFormat2 = ImageEditorActivity.d;
                        Intent intent2 = r5.getIntent();
                        return (intent2 == null || (uri = (Uri) ((Parcelable) yi4.x(intent2, "input-uri", Uri.class))) == null) ? Uri.EMPTY : uri;
                    case 2:
                        Bitmap.CompressFormat compressFormat3 = ImageEditorActivity.d;
                        Intent intent3 = r5.getIntent();
                        if (intent3 != null) {
                            return (Uri) ((Parcelable) yi4.x(intent3, "output", Uri.class));
                        }
                        return null;
                    case 3:
                        Bitmap.CompressFormat compressFormat4 = ImageEditorActivity.d;
                        return r5.s();
                    default:
                        Bitmap.CompressFormat compressFormat5 = ImageEditorActivity.d;
                        return new ra5(r5.getApplicationContext());
                }
            }
        });
        final byte b5 = 4;
        this.c = z4c.b(new Function0(this) { // from class: pwa
            public final /* synthetic */ ImageEditorActivity b;

            {
                this.b = this;
            }

            /* JADX WARN: Type inference failed for: r5v1, types: [android.app.Activity, android.content.Context, com.opera.hype.image.editor.ImageEditorActivity] */
            public final Object invoke() {
                ArrayList parcelableArrayListExtra;
                Uri uri;
                byte b22 = b5;
                ArrayList arrayList = null;
                ?? r5 = this.b;
                switch (b22) {
                    case 0:
                        Bitmap.CompressFormat compressFormat = ImageEditorActivity.d;
                        Intent intent = r5.getIntent();
                        if (intent != null && (parcelableArrayListExtra = intent.getParcelableArrayListExtra("tools")) != null && !parcelableArrayListExtra.isEmpty()) {
                            arrayList = parcelableArrayListExtra;
                        }
                        if (arrayList == null) {
                            nsl.d.getClass();
                            nsl[] nslVarArrValues = nsl.values();
                            arrayList = new ArrayList();
                            for (nsl nslVar : nslVarArrValues) {
                                if (nslVar.c) {
                                    arrayList.add(nslVar);
                                }
                            }
                        }
                        return arrayList;
                    case 1:
                        Bitmap.CompressFormat compressFormat2 = ImageEditorActivity.d;
                        Intent intent2 = r5.getIntent();
                        return (intent2 == null || (uri = (Uri) ((Parcelable) yi4.x(intent2, "input-uri", Uri.class))) == null) ? Uri.EMPTY : uri;
                    case 2:
                        Bitmap.CompressFormat compressFormat3 = ImageEditorActivity.d;
                        Intent intent3 = r5.getIntent();
                        if (intent3 != null) {
                            return (Uri) ((Parcelable) yi4.x(intent3, "output", Uri.class));
                        }
                        return null;
                    case 3:
                        Bitmap.CompressFormat compressFormat4 = ImageEditorActivity.d;
                        return r5.s();
                    default:
                        Bitmap.CompressFormat compressFormat5 = ImageEditorActivity.d;
                        return new ra5(r5.getApplicationContext());
                }
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onCreate(Bundle bundle) {
        Intent intent;
        super/*androidx.fragment.app.r*/.onCreate(bundle);
        View viewInflate = getLayoutInflater().inflate(2131558922, (ViewGroup) null, false);
        if (viewInflate == null) {
            t3p.q("rootView");
            return;
        }
        setContentView((FrameLayout) viewInflate);
        if (bundle == null) {
            Intent intent2 = getIntent();
            if ((intent2 != null ? (Uri) ((Parcelable) yi4.x(intent2, "output", Uri.class)) : null) == null) {
                finish();
                return;
            }
            Intent intent3 = getIntent();
            if ((intent3 != null ? (luf) ((Parcelable) yi4.x(intent3, "output-properties", luf.class)) : null) == null && (intent = getIntent()) != null) {
                intent.putExtra("output-properties", s());
            }
            axa axaVar = new axa();
            w supportFragmentManager = getSupportFragmentManager();
            supportFragmentManager.getClass();
            a aVar = new a(supportFragmentManager);
            aVar.n(axaVar);
            aVar.e(2131362414, axaVar, (String) null, 1);
            aVar.h();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:29:0x005d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.luf s() {
        /*
            r10 = this;
            android.content.Intent r0 = r10.getIntent()
            r1 = 0
            if (r0 == 0) goto La7
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 34
            if (r2 < r3) goto L12
            java.io.Serializable r2 = t8.A(r0)
            goto L21
        L12:
            java.lang.String r2 = "output-format"
            java.io.Serializable r2 = r0.getSerializableExtra(r2)
            java.lang.Class<android.graphics.Bitmap$CompressFormat> r3 = android.graphics.Bitmap.CompressFormat.class
            boolean r3 = r3.isInstance(r2)
            if (r3 != 0) goto L21
            r2 = r1
        L21:
            android.graphics.Bitmap$CompressFormat r2 = (android.graphics.Bitmap.CompressFormat) r2
            if (r2 != 0) goto L27
            android.graphics.Bitmap$CompressFormat r2 = com.opera.hype.image.editor.ImageEditorActivity.d
        L27:
            r4 = r2
            java.lang.String r2 = "output-quality"
            r3 = 100
            int r2 = r0.getIntExtra(r2, r3)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r2)
            if (r2 < 0) goto L3a
            r6 = 101(0x65, float:1.42E-43)
            if (r2 < r6) goto L3b
        L3a:
            r5 = r1
        L3b:
            if (r5 == 0) goto L41
            int r3 = r5.intValue()
        L41:
            r5 = r3
            java.lang.String r2 = "output-max-size"
            java.lang.Class<android.graphics.Point> r3 = android.graphics.Point.class
            java.lang.Object r2 = yi4.x(r0, r2, r3)
            android.os.Parcelable r2 = (android.os.Parcelable) r2
            android.graphics.Point r2 = (android.graphics.Point) r2
            if (r2 == 0) goto L5d
            int r3 = r2.x
            if (r3 <= 0) goto L59
            int r3 = r2.y
            if (r3 <= 0) goto L59
            r1 = r2
        L59:
            if (r1 == 0) goto L5d
        L5b:
            r6 = r1
            goto L78
        L5d:
            android.content.res.Resources r10 = r10.getResources()
            android.util.DisplayMetrics r10 = r10.getDisplayMetrics()
            android.graphics.Point r1 = new android.graphics.Point
            int r2 = r10.widthPixels
            float r2 = (float) r2
            r3 = 1067030938(0x3f99999a, float:1.2)
            float r2 = r2 * r3
            int r2 = (int) r2
            int r10 = r10.heightPixels
            float r10 = (float) r10
            float r10 = r10 * r3
            int r10 = (int) r10
            r1.<init>(r2, r10)
            goto L5b
        L78:
            java.lang.String r10 = "output-description"
            java.lang.String r10 = r0.getStringExtra(r10)
            java.lang.String r1 = ""
            if (r10 != 0) goto L84
            r7 = r1
            goto L85
        L84:
            r7 = r10
        L85:
            java.lang.String r10 = "output-comment"
            java.lang.String r10 = r0.getStringExtra(r10)
            if (r10 != 0) goto L8f
            r8 = r1
            goto L90
        L8f:
            r8 = r10
        L90:
            java.lang.String r10 = "output-watermark-strategy"
            java.lang.Class<qnn> r1 = defpackage.qnn.class
            java.lang.Object r10 = yi4.x(r0, r10, r1)
            android.os.Parcelable r10 = (android.os.Parcelable) r10
            qnn r10 = (defpackage.qnn) r10
            if (r10 != 0) goto La0
            qnn r10 = defpackage.qnn.a
        La0:
            r9 = r10
            luf r3 = new luf
            r3.<init>(r4, r5, r6, r7, r8, r9)
            return r3
        La7:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.opera.hype.image.editor.ImageEditorActivity.s():luf");
    }
}
