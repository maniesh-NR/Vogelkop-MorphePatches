package defpackage;

/* loaded from: classes.dex */
public final class ghg extends aib {
    public boolean q;

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof ghg) && this.q == ((ghg) obj).q;
        }
        return true;
    }

    public final int hashCode() {
        return ((((((((((((((Boolean.hashCode(this.q) - 1863724118) * 31) + 1231) * 31) + 1237) * 31) + 1237) * 31) + 1237) * 31) + 2) * 31) + 1237) * 31) + 46406365;
    }

    public final String toString() {
        return "AndroidWebSettings(allowFileAccess=false, textZoom=100, useWideViewPort=false, standardFontFamily=sans-serif, defaultFontSize=16, loadsImagesAutomatically=true, isAlgorithmicDarkeningAllowed=false, safeBrowsingEnabled=true, domStorageEnabled=" + this.q + ", mediaPlaybackRequiresUserGesture=true, allowProtectedMedia=false, allowMidiSysexMessages=false, hideDefaultVideoPoster=false, layerType=2, enableSandbox=false, sandboxSubdomain=/app/)";
    }
}
