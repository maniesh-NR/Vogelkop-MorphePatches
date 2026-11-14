package ads_mobile_sdk;

import android.util.Base64;
import androidx.core.app.NotificationCompat;
import defpackage.g6p;
import defpackage.rap;
import java.security.KeyFactory;
import java.security.PublicKey;
import java.security.spec.X509EncodedKeySpec;
import java.util.WeakHashMap;
import java.util.concurrent.CancellationException;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.Mac;
import javax.crypto.SecretKey;
import kotlin.text.Charsets;

/* loaded from: classes.dex */
public final class wp {
    public final qr0 a;

    public wp(qr0 qr0Var) {
        this.a = qr0Var;
    }

    public final rap a(String str) {
        rap bv0Var;
        rap ev0Var;
        SecretKey secretKeyGenerateKey;
        byte[] encoded;
        qr0 qr0Var = this.a;
        WeakHashMap weakHashMap = hh3.a;
        rg3 rg3VarA = hh3.a(fw0.CUI_NAME_BLOB_ENCRYPTION, l08.a, true);
        try {
            try {
                KeyGenerator keyGenerator = KeyGenerator.getInstance("AES");
                keyGenerator.init(NotificationCompat.FLAG_HIGH_PRIORITY);
                secretKeyGenerateKey = keyGenerator.generateKey();
                encoded = secretKeyGenerateKey.getEncoded();
            } catch (Exception e) {
                bv0Var = new bv0(e, null, null, 6);
            }
            if (encoded == null || encoded.length != 16) {
                ev0Var = new ev0("Encoded symmetric key had unexected length: " + (encoded != null ? Integer.valueOf(encoded.length) : null));
            } else {
                Cipher cipher = Cipher.getInstance("AES/CBC/PKCS7PADDING");
                cipher.init(1, secretKeyGenerateKey);
                byte[] iv = cipher.getIV();
                if (iv.length != 16) {
                    ev0Var = new ev0("iv had unexpected length: " + iv.length);
                } else {
                    byte[] bArrDoFinal = cipher.doFinal(str.getBytes(Charsets.UTF_8));
                    KeyGenerator keyGenerator2 = KeyGenerator.getInstance("HmacSHA1");
                    keyGenerator2.init(NotificationCompat.FLAG_HIGH_PRIORITY);
                    SecretKey secretKeyGenerateKey2 = keyGenerator2.generateKey();
                    byte[] encoded2 = secretKeyGenerateKey2.getEncoded();
                    if (encoded2 == null || encoded2.length != 16) {
                        ev0Var = new ev0("Hmac is unexpected size: " + (encoded2 != null ? Integer.valueOf(encoded2.length) : null));
                    } else {
                        byte[] bArrC = xih.c(encoded, encoded2);
                        if (bArrC == null) {
                            ev0Var = new ev0("Unable to compute sha1 of symmetric key.");
                        } else {
                            byte[] bArrK = defpackage.b82.k(defpackage.b82.k(bArrC, cipher.getIV()), bArrDoFinal);
                            fo foVar = fo.a$23;
                            PublicKey publicKeyGeneratePublic = KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(Base64.decode((String) qr0Var.a("gads:gads:blob_encryption_public_key", "MIGdMA0GCSqGSIb3DQEBAQUAA4GLADCBhwKBgQDILejyvRuVmPUcwUTpEVaE8A_-D7bZPnTOMs91 WZ0iSLQrK0lcICNKeWom1jWNBxjw89oyra30BlZCDEu7nfGacaTmzX74wD_RJV3xh81_9l2PWr46 0J9DJcXSi4yGzJyyUYp7Q1YXam8J6DYWV6PoemmP71T2fbm9i1VQy1NFgQIBAw", foVar), 8)));
                            Cipher cipher2 = Cipher.getInstance("RSA/None/OAEPwithSHA-1andMGF1Padding");
                            cipher2.init(1, publicKeyGeneratePublic);
                            g6p g6pVarO = jl1.o();
                            fr frVarA = hr.a(0, encoded.length, encoded);
                            g6pVarO.b$1();
                            ((jl1) g6pVarO.b).b(frVarA);
                            fr frVarA2 = hr.a(0, encoded2.length, encoded2);
                            g6pVarO.b$1();
                            ((jl1) g6pVarO.b).a(frVarA2);
                            g6pVarO.b$1();
                            jl1 jl1Var = (jl1) g6pVarO.b;
                            jl1Var.getClass();
                            jl1Var.type_ = 3;
                            jl1Var.bitField0_ |= 1;
                            byte[] bArrDoFinal2 = cipher2.doFinal(((jl1) g6pVarO.a()).a());
                            byte[] bArrDecode = Base64.decode((String) qr0Var.a("gads:blob_encryption_public_key_first_hashed_bytes", Base64.encodeToString(new byte[]{0, 19, -48, -88, -79}, 0), foVar), 11);
                            if (bArrDecode.length != 5) {
                                bv0Var = new ev0("sha1 has of public key has unexpected size: " + bArrDecode.length + "}");
                            } else {
                                byte[] bArrK2 = defpackage.b82.k(defpackage.b82.k(bArrDecode, bArrDoFinal2), bArrK);
                                Mac mac = Mac.getInstance("HmacSHA1");
                                mac.init(secretKeyGenerateKey2);
                                bv0Var = new hv0(Base64.encodeToString(defpackage.b82.k(bArrK2, mac.doFinal(bArrK)), 11));
                            }
                            ev0Var = bv0Var;
                        }
                    }
                }
            }
            if (ev0Var instanceof av0) {
                xh3.a((av0) ev0Var, false);
            }
            rg3VarA.close();
            return ev0Var;
        } catch (Throwable th) {
            try {
                rg3VarA.b(th);
                if (th instanceof iyo) {
                    throw th;
                }
                rg3VarA.a(th);
                if (th instanceof kql) {
                    throw new uw0((kql) th);
                }
                if (th instanceof CancellationException) {
                    throw new ou0(th);
                }
                if (th instanceof mv0) {
                    throw th;
                }
                throw new tu0(th);
            } finally {
            }
        }
    }
}
