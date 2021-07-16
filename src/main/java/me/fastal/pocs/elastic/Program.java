package me.fastal.pocs.elastic;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Program {

    private static final Logger LOG = LoggerFactory.getLogger (Program.class);

    public static void main (String[] args) {

        LOG.debug ("Esto es un debug");
        LOG.info ("Esto es un info");
        LOG.error ("Esto es un error");

    }

}
