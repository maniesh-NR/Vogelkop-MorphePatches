package com.opera.android.qr;

import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.widget.TextView;
import androidx.camera.view.PreviewView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.leanplum.internal.ResourceQualifiers;
import com.opera.android.OperaApplication;
import com.opera.android.custom_views.Spinner;
import com.opera.android.custom_views.StylingImageView;
import defpackage.a7b;
import defpackage.ami;
import defpackage.ei;
import defpackage.gzh;
import defpackage.hjf;
import defpackage.iv0;
import defpackage.lfh;
import defpackage.mcj;
import defpackage.ole;
import defpackage.pde;
import defpackage.pli;
import defpackage.qli;
import defpackage.tsd;
import defpackage.u0a;
import defpackage.umi;
import defpackage.vml;
import defpackage.w4i;
import defpackage.zeh;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/opera/android/qr/ScanQrCodeActivity;", "Lhjf;", "<init>", "()V", "hv3", "app"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ScanQrCodeActivity extends hjf {
    public static final /* synthetic */ int k = 0;
    public lfh j;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.hjf
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getWindow().addFlags(ResourceQualifiers.Qualifier.AnonymousClass5.SCREENLAYOUT_LAYOUTDIR_RTL);
        mcj.s(getWindow(), false);
        setContentView(2131558432);
        ConstraintLayout constraintLayoutFindViewById = findViewById(2131363027);
        int i = 2131361862;
        FloatingActionButton floatingActionButtonJ = w1h.j(2131361862, constraintLayoutFindViewById);
        if (floatingActionButtonJ != null) {
            i = 2131362195;
            if (w1h.j(2131362195, constraintLayoutFindViewById) != null) {
                i = 2131362245;
                PreviewView previewViewJ = w1h.j(2131362245, constraintLayoutFindViewById);
                if (previewViewJ != null) {
                    i = 2131362353;
                    StylingImageView stylingImageView = (StylingImageView) w1h.j(2131362353, constraintLayoutFindViewById);
                    if (stylingImageView != null) {
                        i = 2131362424;
                        TextView textView = (TextView) w1h.j(2131362424, constraintLayoutFindViewById);
                        if (textView != null) {
                            i = 2131362450;
                            StylingImageView stylingImageView2 = (StylingImageView) w1h.j(2131362450, constraintLayoutFindViewById);
                            if (stylingImageView2 != null) {
                                i = 2131362998;
                                StylingImageView stylingImageView3 = (StylingImageView) w1h.j(2131362998, constraintLayoutFindViewById);
                                if (stylingImageView3 != null) {
                                    ConstraintLayout constraintLayout = constraintLayoutFindViewById;
                                    i = 2131363352;
                                    ConstraintLayout constraintLayoutJ = w1h.j(2131363352, constraintLayoutFindViewById);
                                    if (constraintLayoutJ != null) {
                                        i = 2131364525;
                                        if (((Spinner) w1h.j(2131364525, constraintLayoutFindViewById)) != null) {
                                            i = 2131364818;
                                            ConstraintLayout constraintLayoutJ2 = w1h.j(2131364818, constraintLayoutFindViewById);
                                            if (constraintLayoutJ2 != null) {
                                                ei eiVar = new ei(constraintLayout, floatingActionButtonJ, previewViewJ, stylingImageView, textView, stylingImageView2, stylingImageView3, constraintLayoutJ, constraintLayoutJ2);
                                                umi umiVar = vml.d;
                                                lfh lfhVar = new lfh(this, previewViewJ, new gzh((byte) 14));
                                                this.j = lfhVar;
                                                lfhVar.j.j(this, new w4i(new pli(this, (byte) 0), (byte) 3));
                                                if (!fr3.Q(this, "android.permission.CAMERA")) {
                                                    String string = mfh.q(zeh.a).a(getResources()).toString();
                                                    Intent intent = new Intent();
                                                    intent.putExtra("error-message", string);
                                                    setResult(1, intent);
                                                    finish();
                                                }
                                                String[] strArr = OperaApplication.K;
                                                OperaApplication operaApplication = (OperaApplication) getApplication();
                                                tsd tsdVarB = xf8.B(xf8.V((pde) new ole((xd5) this).a, new iv0(this, (byte) 4)));
                                                lfh lfhVar2 = this.j;
                                                if (lfhVar2 == null) {
                                                    lfhVar2 = null;
                                                }
                                                new ami(this, this, umiVar, eiVar, tsdVarB, lfhVar2, ((u0a) operaApplication.s.get()).a, new qli(this, (byte) 0), new pli(this, (byte) 1), new a7b(this, (byte) 29), new qli(this, (byte) 1));
                                                return;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        t3p.q("Missing required view with ID: ".concat(constraintLayoutFindViewById.getResources().getResourceName(i)));
    }

    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i == 24) {
            lfh lfhVar = this.j;
            (lfhVar != null ? lfhVar : null).a(true);
            return true;
        }
        if (i == 25) {
            lfh lfhVar2 = this.j;
            (lfhVar2 != null ? lfhVar2 : null).a(false);
            return true;
        }
        if (i == 27 || i == 80) {
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }
}
