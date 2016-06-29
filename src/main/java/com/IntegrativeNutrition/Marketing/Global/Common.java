package com.IntegrativeNutrition.Marketing.Global;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.*;
import javax.imageio.ImageIO;
import java.text.SimpleDateFormat;
import java.util.*;


/**
 * Created with IntelliJ IDEA.
 * User: Alex
 * Date: 11/13/13
 * Time: 9:59 AM
 * Contains all methods that are common to the whole test suite
 */
public class Common {

    public static final String FRONTEND_URL = "http://iinsandbox.prod.acquia-sites.com";

    public static void captureScreenShot(String screenShotName, String imageType, boolean includeDateTime){
        BufferedImage screenCapture;
        File file;
        String folderName = "ScreenShots";
        SimpleDateFormat simpleDate = new SimpleDateFormat("yyyy-MM-dd_HH");

        try {
            if (includeDateTime) {
                Date currentDateTime = new Date();
                folderName = folderName + "_" + simpleDate.format(currentDateTime.getTime());
                simpleDate.applyPattern("yyyy-MM-dd_HH-mm-ssZ");
                screenShotName = screenShotName + "_" + simpleDate.format(currentDateTime.getTime());
            }

            file = new File(folderName);

            /*If folder does not exists create it.*/
            if (!file.exists())
            {
                if(file.mkdir())
                {
                    file = new File(folderName + "/" + screenShotName);
                }
                else
                {
                    file = new File(screenShotName);
                }
            }
            else
            {
                file = new File(folderName + "/" + screenShotName);
            }

            screenCapture = new Robot().createScreenCapture(new Rectangle(Toolkit.getDefaultToolkit().getScreenSize()));

            /* Ensure that only 3 image formats are allowed otherwise default to jpg */
            if (imageType.equals("jpg") || imageType.equals("png") || imageType.equals("img")) {
                ImageIO.write(screenCapture, imageType, file);
            } else {
                ImageIO.write(screenCapture, "jpg", file);
            }

        } catch (IOException e) {
            e.printStackTrace();
        } catch (AWTException e) {
            e.printStackTrace();
        }
    }

    // convert InputStream to String
    public static String convertInputStreamToString(InputStream is) {

        BufferedReader br = null;
        StringBuilder sb = new StringBuilder();

        String line;
        try {

            br = new BufferedReader(new InputStreamReader(is));
            while ((line = br.readLine()) != null) {
                sb.append(line);
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        return sb.toString();

    }

    public static Boolean doesFileExist(String filePath) {
        File f = new File(filePath);
        return f.exists() && !f.isDirectory();
    }
}