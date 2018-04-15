import { css } from "emotion";
import CodeMirror from "codemirror";
import "codemirror/mode/clojure/clojure";



function greet (name) {
  return "hello " + name;
}

export {
  greet,
  css,
  CodeMirror,
}
