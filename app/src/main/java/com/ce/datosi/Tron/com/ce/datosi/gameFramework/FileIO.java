package com.ce.datosi.Tron.com.ce.datosi.gameFramework;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import android.content.SharedPreferences;

/**
 * Created by erick on 9/28/2016.
 */

public interface FileIO {

    public InputStream readFile(String file) throws IOException;

    public OutputStream writeFile(String file) throws IOException;

    public InputStream readAsset(String file) throws IOException;

    public SharedPreferences getSharedPref();
}

