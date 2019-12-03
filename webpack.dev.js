const HtmlWebpackPlugin = require('html-webpack-plugin');

module.exports = {

    // https://webpack.js.org/concepts/entry-points/#multi-page-application
    entry: {
        index: './src/index.js',
        demo: './src/demo.js'
    },

    // https://webpack.js.org/configuration/dev-server/
    devServer: {
        port: 8080
    },

    // https://webpack.js.org/concepts/loaders/
    module: {
        rules: [
            {
                test: /\.css$/,
                use: [
                    "style-loader",
                    "css-loader"
                ]
            },
            {
                test: /\.js$/,
                exclude: /node_modules/,
                loader: 'babel-loader',
                options: {
                    presets: ['@babel/preset-env']
                }
            },
        ]
    },

    // https://webpack.js.org/concepts/plugins/
    plugins: [
        new HtmlWebpackPlugin({
            template: './src/index.html',
            inject: true,
            chunks: ['index'],
            filename: 'index.html'
        }),
        new HtmlWebpackPlugin({
            template: './src/demo.html',
            inject: true,
            chunks: ['demo'],
            filename: 'demo.html'
        })
    ]
};
