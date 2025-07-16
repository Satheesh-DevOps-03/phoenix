FROM python:3.10-slim

LABEL maintainer="phoenix-team"

ARG build_version=1.0.0
ENV BUILD_VERSION=${build_version}

WORKDIR /app

# Install dependencies
COPY requirements.txt .
RUN pip install --no-cache-dir -r requirements.txt

# Copy application code
COPY . .

EXPOSE 5000

CMD ["python", "app.py"]
