const fs = require('fs-extra');
const concat = require('concat');

(async function build() {
  const files = [
    './dist/my-custom-element/runtime.js',
    './dist/my-custom-element/polyfills.js',
    // './dist/my-custom-element/scripts.js',
    './dist/my-custom-element/main.js',
  ]

  await fs.ensureDir('elements')

  await concat(files, 'elements/angular-element.js');

  await fs.copyFile('./dist/my-custom-element/styles.css', 'elements/styles.css')

  // await fs.copy('./dist/elements-demo/assets/', 'elements/assets/' )

})()
