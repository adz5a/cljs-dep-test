"use strict";

const webpack = require("webpack");
const { join, resolve } = require("path");

const config = {
  entry: {
    common: resolve(__dirname, "src/js/common.js"),
    message: resolve(__dirname, "src/js/message.js"),
  },
  output: {
    filename: "[name].js",
    path: resolve(__dirname, "resources/compiled/js"),
    libraryTarget: "commonjs2"
  }
};

webpack(config, (err) => {
  if (err) {
    throw err;
  }
  console.log("done");
});
