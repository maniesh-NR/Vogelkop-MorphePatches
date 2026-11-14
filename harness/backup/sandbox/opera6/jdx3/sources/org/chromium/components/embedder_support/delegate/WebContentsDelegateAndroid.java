package org.chromium.components.embedder_support.delegate;

import J.N;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.view.KeyEvent;
import defpackage.qp2;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import org.chromium.base.JniOnceCallback;
import org.chromium.content_public.browser.RenderFrameHost;
import org.chromium.content_public.browser.WebContents;
import org.chromium.content_public.common.ResourceRequestBody;
import org.chromium.ui.base.WindowAndroid;
import org.chromium.url.GURL;

/* loaded from: classes.dex */
public class WebContentsDelegateAndroid {
    public static final HashMap a = new HashMap();

    public static WebContentsDelegateAndroid getDelegate(long j) {
        WeakReference weakReference = (WeakReference) a.get(Long.valueOf(j));
        if (weakReference == null) {
            return null;
        }
        return (WebContentsDelegateAndroid) weakReference.get();
    }

    public static boolean handleKeyboardEventFallback(WindowAndroid windowAndroid, KeyEvent keyEvent) {
        return false;
    }

    public static boolean preHandleKeyboardEvent(WindowAndroid windowAndroid, KeyEvent keyEvent) {
        return false;
    }

    public static void registerRef(long j, WebContentsDelegateAndroid webContentsDelegateAndroid) {
        if (((WeakReference) a.put(Long.valueOf(j), new WeakReference(webContentsDelegateAndroid))) == null) {
            return;
        }
        qp2.n(p3p.l(j, "WebContentsDelegateAndroid already exists for native pointer: "));
    }

    public static void unregisterRef(long j) {
    }

    public void activateContents() {
    }

    public final boolean addMessageToConsole(int i, String str, int i2, String str2) {
        return false;
    }

    public final boolean canDownload(GURL gurl, String str) {
        return true;
    }

    public final boolean canEnterFullscreenModeForTab(RenderFrameHost renderFrameHost) {
        return true;
    }

    public final void cancelKeyboardLockRequest() {
    }

    public void closeContents() {
    }

    public void contentsZoomChange(boolean z) {
    }

    public boolean controlsResizeView() {
        return false;
    }

    public final void didBackForwardTransitionAnimationChange() {
    }

    public final void didChangeCloseSignalInterceptStatus() {
    }

    public void enterFullscreenModeForTab(RenderFrameHost renderFrameHost, boolean z, boolean z2, long j) {
    }

    public void exitFullscreenModeForTab() {
    }

    public final void fullscreenStateChangedForTab(RenderFrameHost renderFrameHost, boolean z, boolean z2, long j) {
    }

    public final int getBackForwardTransitionFallbackUXFaviconBackgroundColor() {
        return 0;
    }

    public final Bitmap getBackForwardTransitionFallbackUXInternalPageIcon() {
        return null;
    }

    public final int getBackForwardTransitionFallbackUXPageBackgroundColor() {
        return 0;
    }

    public int getBottomControlsHeight() {
        return 0;
    }

    public int getBottomControlsMinHeight() {
        return 0;
    }

    public final int getDisplayModeChecked() {
        return 0;
    }

    public final long getFullscreenTargetDisplay() {
        return -1L;
    }

    public int getTopControlsHeight() {
        return 0;
    }

    public int getTopControlsMinHeight() {
        return 0;
    }

    public int getVirtualKeyboardHeight() {
        return 0;
    }

    public void handleKeyboardEvent(KeyEvent keyEvent) {
    }

    public boolean isFullscreenForTabOrPending() {
        return false;
    }

    public void loadingStateChanged(boolean z) {
    }

    public final boolean maybeCopyContentAreaAsBitmap(JniOnceCallback jniOnceCallback) {
        jniOnceCallback.destroy();
        return false;
    }

    public final Bitmap maybeCopyContentAreaAsBitmapSync() {
        return null;
    }

    public final boolean maybeCopyContentAreaAsHardwareBuffer(JniOnceCallback jniOnceCallback) {
        jniOnceCallback.destroy();
        return false;
    }

    public void navigationStateChanged(int i) {
    }

    public final void onUpdateTargetUrl(GURL gurl) {
    }

    public final void openNewTab(GURL gurl, String str, ResourceRequestBody resourceRequestBody, int i, boolean z) {
    }

    public void rendererResponsive() {
    }

    public void rendererUnresponsive() {
    }

    public final void requestImmersivePlaybackConfirmation(int i, int i2, int i3) {
        if (i3 != 0) {
            N.MFwGQEih(i3, 3, 0, 0, false);
        }
    }

    public final void requestKeyboardLock(boolean z) {
    }

    public final void setContentsBounds(WebContents webContents, Rect rect) {
    }

    public final boolean shouldAnimateBrowserControlsHeightChanges() {
        return false;
    }

    public final boolean shouldBlockMediaRequest(GURL gurl) {
        return false;
    }

    public boolean shouldCreateWebContents(GURL gurl) {
        return true;
    }

    public final int shouldOverrideUserAgentForPreloading(GURL gurl) {
        return 0;
    }

    public final void showRepostFormWarningDialog() {
    }

    public final boolean takeFocus(boolean z) {
        return false;
    }

    public void visibleSSLStateChanged() {
    }
}
