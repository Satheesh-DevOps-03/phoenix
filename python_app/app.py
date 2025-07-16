from flask import Flask
import os

app = Flask(__name__)

@app.route('/')
def home():
    build_version = os.environ.get('BUILD_VERSION', 'N/A')
    return f'Hello from Flask inside Docker!<br>ENV BUILD_VERSION={build_version}'

if __name__ == '__main__':
    app.run(host='0.0.0.0', port=5000)
