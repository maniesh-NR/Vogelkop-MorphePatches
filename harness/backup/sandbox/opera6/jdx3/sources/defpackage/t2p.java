package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.CookieManager;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes.dex */
public final class t2p extends RelativeLayout implements View.OnKeyListener {
    public static final int k;
    public WebView a;
    public Context b;
    public ltm c;
    public String d;
    public ImageButton e;
    public ImageButton f;
    public ImageButton g;
    public ImageButton h;
    public aoo i;
    public boolean j;

    static {
        AtomicLong atomicLong;
        long j;
        long j2;
        do {
            atomicLong = sjo.c;
            j = atomicLong.get();
            j2 = j + 1;
        } while (!atomicLong.compareAndSet(j, j2 <= 9223372036854775806L ? j2 : 1L));
        k = (int) j;
    }

    public static t2p b(Context context, String str, View view, ltm ltmVar) {
        final byte b = 0;
        final t2p t2pVar = new t2p(context, null, 0);
        t2pVar.b = context;
        final byte b2 = 1;
        t2pVar.setFocusableInTouchMode(true);
        t2pVar.requestFocus();
        t2pVar.setOnKeyListener(t2pVar);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        linearLayout.setOrientation(1);
        RelativeLayout relativeLayout = new RelativeLayout(context);
        relativeLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        linearLayout.addView(relativeLayout);
        LinearLayout linearLayout2 = new LinearLayout(context);
        int i = k;
        linearLayout2.setId(i);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(12);
        linearLayout2.setLayoutParams(layoutParams);
        linearLayout2.setBackground(bbp.BACKGROUND.d(context));
        relativeLayout.addView(linearLayout2);
        t2pVar.e = t2pVar.a(bbp.LEFT_ARROW.d(context));
        t2pVar.f = t2pVar.a(bbp.RIGHT_ARROW.d(context));
        t2pVar.g = t2pVar.a(bbp.REFRESH.d(context));
        t2pVar.h = t2pVar.a(sgb.F(2131231171, context));
        linearLayout2.addView(t2pVar.e);
        linearLayout2.addView(t2pVar.f);
        linearLayout2.addView(t2pVar.g);
        linearLayout2.addView(t2pVar.h);
        t2pVar.a = new WebView(context.getApplicationContext());
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -1);
        final byte b3 = 2;
        layoutParams2.addRule(2, i);
        t2pVar.a.setLayoutParams(layoutParams2);
        relativeLayout.addView(t2pVar.a);
        t2pVar.addView(linearLayout);
        t2pVar.c = ltmVar;
        t2pVar.d = str;
        WebSettings settings = t2pVar.a.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setUseWideViewPort(true);
        settings.setDomStorageEnabled(true);
        settings.setSupportZoom(true);
        settings.setBuiltInZoomControls(false);
        settings.setAllowFileAccess(false);
        settings.setAllowContentAccess(false);
        ltm ltmVar2 = t2pVar.c;
        if (ltmVar2 != null) {
            settings.getUserAgentString();
            settings.setUserAgentString(ltmVar2.k());
        }
        if (!t2pVar.d.startsWith("http")) {
            t2pVar.d = "about:blank";
        }
        t2pVar.a.loadUrl(t2pVar.d);
        CookieManager.getInstance().setAcceptThirdPartyCookies(t2pVar.a, true);
        t2pVar.a.setOnKeyListener(t2pVar);
        final byte b4 = 3;
        t2pVar.a.setWebViewClient(new c5d(t2pVar, b4));
        t2pVar.e.setBackgroundColor(0);
        t2pVar.e.setOnClickListener(new View.OnClickListener(t2pVar) { // from class: y1p
            public final /* synthetic */ t2p b;

            {
                this.b = t2pVar;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                byte b5 = b;
                t2p t2pVar2 = this.b;
                switch (b5) {
                    case 0:
                        WebView webView = t2pVar2.a;
                        if (webView != null && webView.canGoBack()) {
                            t2pVar2.a.goBack();
                            break;
                        }
                        break;
                    case 1:
                        WebView webView2 = t2pVar2.a;
                        if (webView2 != null && webView2.canGoForward()) {
                            t2pVar2.a.goForward();
                            break;
                        }
                        break;
                    case 2:
                        WebView webView3 = t2pVar2.a;
                        if (webView3 != null) {
                            webView3.reload();
                            break;
                        }
                        break;
                    default:
                        t2pVar2.c();
                        break;
                }
            }
        });
        t2pVar.f.setBackgroundColor(0);
        t2pVar.f.setOnClickListener(new View.OnClickListener(t2pVar) { // from class: y1p
            public final /* synthetic */ t2p b;

            {
                this.b = t2pVar;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                byte b5 = b2;
                t2p t2pVar2 = this.b;
                switch (b5) {
                    case 0:
                        WebView webView = t2pVar2.a;
                        if (webView != null && webView.canGoBack()) {
                            t2pVar2.a.goBack();
                            break;
                        }
                        break;
                    case 1:
                        WebView webView2 = t2pVar2.a;
                        if (webView2 != null && webView2.canGoForward()) {
                            t2pVar2.a.goForward();
                            break;
                        }
                        break;
                    case 2:
                        WebView webView3 = t2pVar2.a;
                        if (webView3 != null) {
                            webView3.reload();
                            break;
                        }
                        break;
                    default:
                        t2pVar2.c();
                        break;
                }
            }
        });
        t2pVar.g.setBackgroundColor(0);
        t2pVar.g.setOnClickListener(new View.OnClickListener(t2pVar) { // from class: y1p
            public final /* synthetic */ t2p b;

            {
                this.b = t2pVar;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                byte b5 = b3;
                t2p t2pVar2 = this.b;
                switch (b5) {
                    case 0:
                        WebView webView = t2pVar2.a;
                        if (webView != null && webView.canGoBack()) {
                            t2pVar2.a.goBack();
                            break;
                        }
                        break;
                    case 1:
                        WebView webView2 = t2pVar2.a;
                        if (webView2 != null && webView2.canGoForward()) {
                            t2pVar2.a.goForward();
                            break;
                        }
                        break;
                    case 2:
                        WebView webView3 = t2pVar2.a;
                        if (webView3 != null) {
                            webView3.reload();
                            break;
                        }
                        break;
                    default:
                        t2pVar2.c();
                        break;
                }
            }
        });
        t2pVar.h.setBackgroundColor(0);
        t2pVar.h.setOnClickListener(new View.OnClickListener(t2pVar) { // from class: y1p
            public final /* synthetic */ t2p b;

            {
                this.b = t2pVar;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                byte b5 = b4;
                t2p t2pVar2 = this.b;
                switch (b5) {
                    case 0:
                        WebView webView = t2pVar2.a;
                        if (webView != null && webView.canGoBack()) {
                            t2pVar2.a.goBack();
                            break;
                        }
                        break;
                    case 1:
                        WebView webView2 = t2pVar2.a;
                        if (webView2 != null && webView2.canGoForward()) {
                            t2pVar2.a.goForward();
                            break;
                        }
                        break;
                    case 2:
                        WebView webView3 = t2pVar2.a;
                        if (webView3 != null) {
                            webView3.reload();
                            break;
                        }
                        break;
                    default:
                        t2pVar2.c();
                        break;
                }
            }
        });
        t2pVar.j = false;
        ViewGroup viewGroup = (ViewGroup) upj.f(context, view);
        if (viewGroup != null) {
            viewGroup.addView(t2pVar, new FrameLayout.LayoutParams(-1, -1));
        }
        return t2pVar;
    }

    public final ImageButton a(Drawable drawable) {
        ImageButton imageButton = new ImageButton(this.b);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2, 1.0f);
        layoutParams.gravity = 16;
        imageButton.setLayoutParams(layoutParams);
        imageButton.setImageDrawable(drawable);
        return imageButton;
    }

    public final void c() {
        if (this.j) {
            return;
        }
        WebView webView = this.a;
        if (webView != null) {
            webView.stopLoading();
            this.a.setOnKeyListener(null);
        }
        setOnKeyListener(null);
        removeAllViews();
        upj.j(this);
        this.j = true;
        aoo aooVar = this.i;
        if (aooVar != null) {
            aooVar.m();
        }
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i != 4) {
            return false;
        }
        WebView webView = this.a;
        if (webView == null || !webView.canGoBack()) {
            c();
            return true;
        }
        this.a.goBack();
        return true;
    }
}
